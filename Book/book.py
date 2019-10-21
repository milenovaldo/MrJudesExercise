import author import author

class Book():
    def __init__(self, name, author, price, qty):
        self.__name = name
        self.__author = author.Author()
        self.__price = price
        self.__qty = qty