import banking as bank

class Main():

    def __init__(self):
        self.__bankName = 'BCA'
        self.__bankObject = bank.Bank(self.__bankName)

    def adminOptions(self):
        print(
            'Admin Menu \n' +
            '1. Add Customer \n' +
            '2. Get Customer Info\n' +
            '3. Remove Customer \n' +
            '4. Number of customer'
        )
        adminOption = int(input('Select an admin option: '))
        if adminOption == 1:
            try:
                firstName = str(input('Enter new customer\'s first name: '))
                lastName = str(input('Enter new customer\'s last name: '))
                self.__bankObject.addCustomer(firstName.title(), lastName.title())
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        elif adminOption == 2:
            try:
                firstName = str(input('Enter new customer\'s first name: '))
                lastName = str(input('Enter new customer\'s last name: '))
                account = int(input('Enter account: '))
                self.__bankObject.getCustomer(firstName.title(), lastName.title(), account)
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        elif adminOption == 3:
            try:
                firstName = str(input('Enter customer\'s first name: '))
                lastName = str(input('Enter customer\'s last name: '))
                self.__bankObject.removeCustomer(firstName.title(), lastName.title())
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        elif adminOption == 4:
            print(f'There are {self.__bankObject.numOfCustomers()} customers.')
        else:
            print('Invalid option')

    def customerOption(self):
        print(
            'Customer Menu \n' +
            '1. Check Balance \n' +
            '2. Deposit \n' +
            '3. Withdraw ' 
        )
        
        selection = int(input('Select an option: '))
        
        if selection == 1:
            try:
                firstName = str(input('Enter customer\'s first name: '))
                lastName = str(input('Enter customer\'s last name: '))
                account = int(input('Enter account: '))
                self.__bankObject.getCustomer(firstName.title(), lastName.title(), account)
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        elif selection == 2:
            try:
                firstName = str(input('Enter customer\'s first name: '))
                lastName = str(input('Enter customer\'s last name: '))
                account = int(input('Enter account: '))
                deposit = int(input('Enter amount to deposit: '))
                print(
                    f'Name: {firstName} {lastName}\n' +
                    f'You have successfully deposited Rp.{deposit} \n' +
                    f'Balance >> {print(self.__bankObject.Account(account - deposit).getBalance())}'
                )
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        elif selection == 3:
            try:
                firstName = str(input('Enter customer\'s first name: '))
                lastName = str(input('Enter customer\'s last name: '))
                account = int(input('Enter account: '))
                deposit = int(input('Enter amount to deposit: '))
                print(
                    f'Name: {firstName} {lastName}\n' +
                    f'You have successfully withdrawn Rp.{deposit} \n' +
                    f'Balance >> {print(self.__bankObject.Account(account + deposit).getBalance())}'
                )
            except Exception as e:
                print(
                    f'{e} \n' +
                    'Please enter all the required inputs properly' 
                )
        else:
            print('Invalid option')

while 1:
    print(
        f'Welcome to BCA menu \n' +
        f'1. Admin Option \n' + 
        f'2. Customer Option'
    )
    selection = int(input('Enter a selection: '))
    if selection == 1:
        Main().adminOptions()
    elif selection == 2:
        Main().customerOption()