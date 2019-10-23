class EmployeeInfo:
    def __init__(self, datafile):
        self.__datafile = datafile

    def newStaff(self, ident: str, name: str, position: str, salary: int):
        with open(self.__datafile, 'r') as fp:
            identList = [i[:5] for i in fp.read().splitlines()]
        verifSalary = 0
        try:
            if len(ident) == 5 and ident[0].upper() == 'S' and ident.upper() not in identList and type(int((ident[1:5]))) == type(2):
                verifIdent = ident.upper()
            elif position.title() == 'Staff':
                if salary >= 3500000 and salary <= 7000000:
                    verifSalary = salary
            elif position.title() == 'Officer':
                if salary >= 7000000 and salary <= 10000000:
                    verifSalary = salary
            elif position.title() == 'Manager':
                if salary > 10000000:
                    verifSalary = salary
        except Exception as e:
            print(e)
        try:
            with open(self.__datafile, 'r') as fp: 
                fp.write(f'{verifIdent}#{name}#{position}#{verifSalary}\n')
        except Exception as e:
            print(e)
     

    def deleteStaff(self, id: str):
        with open(self.__datafile, 'r') as fp:
            idList = [i[:5] for i in fp.read().splitlines()]
            recordList = fp.read().splitlines()
        if id in idList:
            recordList.remove(idList.index(id))
            with open(self.__datafile, 'w') as fp:
                for record in recordList:
                    fp.write(f'{record}\n')
            print('Data successfully deleted')
        else:
            print('Employee ID not found')

    def summaryData(self):
        with open(self.__datafile, 'r') as fp:
            recordList = fp.read().splitlines()
            positionList = []
            for i in range(0, len(recordList)):
                positionList.append(recordList[i].split('#'))
            print(recordList)
            print(positionList)
        staffSalary = []
        officerSalary = []
        managerSalary = []
        for element in positionList:
            if element[2] == 'Staff':
                staffSalary.append(element[3])
            elif element[2] == 'Officer':
                officerSalary.append(element[3])
            elif element[2] == 'Manager': 
                managerSalary.append(element[3])
        print(
            f'1. Staff\n' +
            f'Minumum Salary: {min(staffSalary)}\n' +
            f'Maximum Salary: {max(staffSalary)}\n' +
            f'Average Salary: {round(sum(staffSalary)/len(staffSalary))}\n\n' +
            f'2. Officer\n' +
            f'Minumum Salary: {min(officerSalary)}\n' +
            f'Maximum Salary: {max(officerSalary)}\n' +
            f'Average Salary: {round(sum(officerSalary)/len(officerSalary))}\n\n' +
            f'3. Manager\n' +
            f'Minumum Salary: {min(managerSalary)}\n' +
            f'Maximum Salary: {max(managerSalary)}\n' +
            f'Average Salary: {round(sum(managerSalary)/len(managerSalary))}\n\n' 
        )

    def saveExit(self):
        print('This program can see the future so it saved the file before you saved it')

while 1:
    print(
        '1. New staff\n' +
        '2. Delete staff\n' +
        '3. View summary data\n' +
        '4. Save and exit'
    )
    inputChoice = int(input('Input choice: '))
    ei = EmployeeInfo('data.txt')
    if inputChoice == 1:
        try:
            inputID = str(input('Input ID[SXXXX]: '))
            inputName = str(input('Input Name: '))
            inputPos = str(input('Input Position[Staff|Officer|Manager]: '))
            inputSalary = int(input(f'Input Salary for {inputPos}: '))
            ei.newStaff(inputID, inputName, inputPos, inputSalary)
        except Exception as e:
            print(e)

    elif inputChoice == 2:
        try:
            inputIDToDel = str(input('Input ID[SXXXX]: '))
            ei.deleteStaff(inputIDToDel)
        except Exception as e:
            print(e)
    elif inputChoice == 3:
        ei.summaryData()
    elif inputChoice == 4:
        ei.saveExit()

#'S0213', 'DSFSDFDSF', 'ADASDA', 342424124
