from author import Author
from book import Book

atList = []
bookList = []
'''
at = Author('Christopher Nolan', 'contact@chrisnolan.com', 'M')
book = Book('Interstellar', at, 9.99, 10)
''' 
def addBook():
    authorNameInput = str(input('Enter author name: '))
    authorEmailInput = str(input('Enter author email: '))
    authorGenderInput = str(input('Enter author gender: '))

    bookNameInput = str(input('Enter book name: '))
    bookPriceInput = float(input('Enter book price: '))
    bookQtyInput = int(input('Enter book quantity: '))

    atInput = Author(authorNameInput, authorEmailInput, authorGenderInput)
    atList.append(atInput)
    bookList.append(Book(bookNameInput, atInput, bookPriceInput, bookQtyInput))

def printBooks():
    for i in range(len(atList)):
        at = atList[i]
        book = bookList[i]
        print(book.toString())

while 1:
    print(
        '1. Add book \n' +
        '2. Print book'
    )
    option = int(input('Enter option >> '))
    if option == 1:
        addBook()
    elif option == 2:
        printBooks()