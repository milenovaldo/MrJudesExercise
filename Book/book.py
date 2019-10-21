from author import Author

class Book:
    
    __name = ''
    __author = Author('', '', '')
    __price = 0.0
    __qty = 0

    def __init__(self, name, author, price, qty):
        self.__name = name
        self.__author = author
        self.__price = price
        self.__qty = qty

    def setPrice(self, price):
        if price > 0:
            self.__price = price
        else:
            pass

    def setQty(self, qty):
        if qty > 0:
            self.__qty = qty
        else:
            pass

    def getName(self):
        return self.__name

    def getAuthor(self):
        return self.__author

    def getPrice(self):
        return self.__price

    def getQty(self):
        return self.__qty

    def toString(self):
        return f'Book[name={self.getName()}, Author[name={self.__author.getName()}, email={self.__author.getEmail()}, gender={self.__author.getGender()}], price={self.getPrice()}, qty={self.getQty()}]'



