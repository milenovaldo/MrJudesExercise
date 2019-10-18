class Account():

    __balance = 0 #PRIVATE

    def __init__(self, balance):
        self.__balance = balance 

    def getBalance(self):
        return self.__balance

    def deposit(self, amt):
        if type(amt) == type(0) and amt > 1000:
            self.__balance = self.__balance + amt
            return True
        else:
            return False

    def withdraw(self, amt):
        if amt > 500:
            self.__balance -= amt
            return True
        else:
            return False

class Customer():
    
    def __init__(self, firstName, lastName):
        self.__firstName = firstName
        self.__lastName = lastName

    def getFirstName(self):
        return self.__firstName

    def getLastName(self):
        return self.__lastName
    
    def getAccount(self):
        return self.__account

    def setAccount(self, acct):
        self.__account = Account(acct)

class Bank():

    def __init__(self, bName):
        self.__filePath = 'customer.txt'
        with open(self.__filePath, 'r') as fp:
            self.__customer = fp.read().splitlines()
        self.__numberOfCustomers = len(self.__customer)
        self.__bankName = bName


    def addCustomer(self, fName, lName):
        self.__customer.append(f"{Customer('Luck', 'Man').getFirstName()} {Customer('Luck', 'Man').getLastName()}")
        self.__customer.append(f'{fName.title()} {lName.title()}')
        with open(self.__filePath, 'w') as wfp:
            for element in self.__customer:
                wfp.write(element + '\n')

    def numOfCustomers(self):
        return self.__numberOfCustomers
    
    def getCustomer(self, fName, lName, acct):
        fullName = f'{fName} {lName}'
        cs = Customer(fName, lName)
        if fullName in self.__customer:
            print(
                f'Customer {fName} {lName} found \n' +
                f'Balance >> Rp.{Account(acct).getBalance()}'
                )
        else:
            print('Customer not found.')

    def removeCustomer(self, fName, lName):
        concatinatedName = f'{fName} {lName}'
        if concatinatedName in self.__customer:
            self.__customer.remove(f'{fName.title()} {lName.title()}')
            with open(self.__filePath, 'w') as wfp:
                for element in self.__customer:
                    wfp.write(element + '\n')
            print(f'Customer {concatinatedName} has been removed.')
        else:
            print(f'Customer {concatinatedName} not in database.')

