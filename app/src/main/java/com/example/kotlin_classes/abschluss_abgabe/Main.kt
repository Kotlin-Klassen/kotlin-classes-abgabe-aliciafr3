package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Creating an instance of the Library class
    val library = Library()

    // Adding books to the library
    val book1 = Book("The Big Book of PAW Patrol", "Nickelodeon Publishing", Genre.SCIENCE, BookStatus.Available)
    val book2 = Book("Carrie", "Stephen King", Genre.CHILDREN, BookStatus.Available)
    val book3 = Book("Faust", "Johann Wolfgang von Goethe", Genre.NON_FICTION, BookStatus.Available)
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    println(" ")
    println("-------ADDRESS------")

    // Creating and printing the address of the library
    val libraryAddress = Library.LibraryAddress("Pipe Plaza", "Bowser's Castle", "42020")
    libraryAddress.printAddress()

    // Creating a library member
    val member = library.LibraryMember("Bob", "kdh3jdfj")

    // Checking out a book and reserving a book by the member
    member.checkoutBook(book1, "24.12.2024")
    member.reserveBook(book2)


    println(" ")
    println("-------STATUS-------")


    // Showing the  status of all the books in the library
    library.showAllBooksStatus()

    println(" ")
    println("-------SEARCH-------")

    // Searching for a book by its title and displaying the results
    val searchResults = library.searchBook("Faust")
    searchResults.forEach { println("${it.title} by ${it.author}") }
}