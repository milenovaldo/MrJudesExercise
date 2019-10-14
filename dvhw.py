#%%
import csv
import numpy as np
import datetime as dt
import matplotlib.pyplot as plt
import pygal as pg
import statistics as st

class DataVis():

    def __init__(self, fileName):
        self.fileName = fileName

    def meanTotalSteps(self, optionalFileName = "C:/Exercises/MrJude/csv/activity.csv"):
        filename = "C:/Exercises/MrJude/csv/activity.csv"

        dictionary = {}
        dictionaryInterval = {}
        dictionaryIntervalWeekdays = {}
        dictionaryIntervalWeekends = {}

        with open(optionalFileName) as f:
            reader = csv.reader(f)
            headerRow = next(reader)
            for row in reader:
                steps = row[0]
                if row[0] != 'NA':
                    date = row[1]
                    date2 = int(dt.datetime.strptime(date, "%Y-%m-%d").day)
                    interval = int(row[2])
                    dictionary.setdefault(str(date), [])
                    dictionary[str(date)].append(int(steps))
                    dictionaryInterval.setdefault(interval, [])
                    dictionaryInterval[interval].append(int(steps))

                    if date2 % 7 == 0:
                        dictionaryIntervalWeekends.setdefault(interval, [])
                        dictionaryIntervalWeekends[interval].append(int(steps))
                    else:
                        dictionaryIntervalWeekdays.setdefault(interval, [])
                        dictionaryIntervalWeekdays[interval].append(int(steps))

        listDate = []
        listTotal = []
        listAv = []

        for i in dictionary.keys():
            listDate.append(i)
            listTotal.append(sum(dictionary.get(i)))
            listAv.append(st.mean(dictionary.get(i)))

        plt.hist(listTotal)
        plt.title('Total steps per day')
        plt.xlabel('Steps per day')
        plt.ylabel('Frequency')
        plt.xticks(range(0,25,5))
        plt.show()
        return listAv

    def dailyActivityPattern(self):
        with open(self.fileName, 'r') as fp:
            reader = csv.reader(fp)
            next(reader)
            intervals = [row[2] for row in reader]
            fp.seek(0)
            next(reader)
            steps = [row[0] for row in reader]
            plt.plot(intervals, steps)
            plt.title('Daily Activity')
            plt.xlabel('Intervals')
            plt.ylabel('Steps')
            plt.show()
            maxIntervals = []
            for i in range(len(steps)):
                if steps[i] == max(steps):
                    maxIntervals.append(intervals[i])
                else:
                    continue
            return maxIntervals
  
    def inputMissingValues(self, newFileName):
        with open(self.fileName, 'r') as fp:
            reader = csv.reader(fp)
            next(reader)
            steps = [row[0] for row in reader]
            fp.seek(0)
            next(reader)
            dates = [row[1] for row in reader]
            fp.seek(0)
            next(reader)
            intervals = [row[2] for row in reader]
            for i in range(len(steps)):
                if steps[i] == 'NA':
                    try:
                        replacement = int(input(f'Enter a new input for {dates[i]} and interval {intervals[i]}: '))
                        steps[i] = replacement
                    except:
                        print('Enter a valid input')
                else:
                    continue
            with open(newFileName, 'w', newline='') as f:
                writer = csv.writer(f, delimiter = ',', quoting=csv.QUOTE_MINIMAL)
                writer.writerow(['steps', 'date', 'interval'])
                for j in range(len(steps)):
                    writer.writerow([steps[j], dates[j], intervals[j]])
        self.meanTotalSteps(newFileName)

    
    #I have ran out of brain power to do the last one. Forgive me, Mr Jude.

dv = DataVis("C:/Exercises/MrJude/csv/activity.csv")

print(dv.meanTotalSteps()) #Accepts absolute path of the csv as an optional parameter
#print(dv.dailyActivityPattern())
dv.inputMissingValues("C:/Exercises/MrJude/csv/newActivity.csv") #Requires the path to the new csv containing the new values
#%%