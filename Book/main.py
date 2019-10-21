from author import Author
from book import Book

at = Author('Christopher Nolan', 'contact@chrisnolan.com', 'M')
book = Book('Interstellar', at, 9.99, 10)
print(book.toString())