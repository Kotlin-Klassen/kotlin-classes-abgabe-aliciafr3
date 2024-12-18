package com.example.kotlin_classes.abschluss_abgabe

class Library {
    // Storing the list of books in the library
    private val books = mutableListOf<Book>()


    // Nested class LibraryAddress to store address details
    class LibraryAddress(
        private val street: String,
        private val city: String,
        private val zipCode: String
    ) {
        // Printing the library address
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    // Inner class LibraryMember to represent library members and what they can do with a book
    inner class LibraryMember(val name: String, val memberID: String) {
        // Checking out a book and updating its status
        fun checkoutBook(book: Book, dueDate: String) {
            val checkedOutBook = book.copy(status = BookStatus.CheckedOut(dueDate))
            books[books.indexOf(book)] = checkedOutBook
        }

        // Reserving a book and updating its status
        fun reserveBook(book: Book) {
            val reservedBook = book.copy(status = BookStatus.Reserved(name))
            books[books.indexOf(book)] = reservedBook
        }
    }

    // Adding a book to the library
    fun addBook(book: Book) {
        books.add(book)
    }

    // Searching for a book by title or author
    fun searchBook(query: String): List<Book> {
        return books.filter { it.title.contains(query, true) || it.author.contains(query, true) }
    }

    // Showing the status of all books in the library
    fun showAllBooksStatus() {
        books.forEach {
            println("${it.title} by ${it.author} - ${it.status.printStatus()}")
        }
    }
}