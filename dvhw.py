#%%
import csv
import numpy as np
import datetime as dt
import matplotlib.pyplot as plt
import pygal as pg

class DataVis():

    def __init__(self, fileName):
        self.fileName = fileName

    def meanTotalSteps(self, optionalFileName = "csv/activity.csv"):
        retDict = {}
        with open(optionalFileName, "r") as f:
            reader = csv.reader(f)
            next(reader)
            dateList = []
            stepsList = []
            for row in reader:
                if row[1] not in dateList:
                    dateList.append(row[1])
                else:
                    continue
            f.seek(0)
            next(reader)
            for date in dateList:
                f.seek(0)
                next(reader)
                for row in reader:
                    if row[1] == date:
                        stepsList.append(int(row[0]))
                    else:
                        continue
                retDict[date] = sum(stepsList)
                sMean = np.mean(stepsList)
                sMedian = np.median(stepsList)
                print(f'Date: {date} Mean: {sMean} Median: {sMedian}')

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

dv.meanTotalSteps() #Accepts absolute path of the csv as an optional parameter
dv.dailyActivityPattern()
dv.inputMissingValues('csv/newActivity.csv') #Requires the path to the new csv containing the new values
#%%