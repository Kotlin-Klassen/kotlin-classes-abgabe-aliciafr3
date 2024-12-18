package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {

    // Representing a book that is available
    object Available : BookStatus() {
        // Printing out the status of an available book
        override fun printStatus() = "This book is available! :D"
    }

    // Representing a book that has been checked out, with a due date
    data class CheckedOut(val dueDate: String) : BookStatus() {
        // Printing out the status of a checked out book
        override fun printStatus() = "This book is checked out.... :c but will be back on $dueDate!"
    }

    // Representing a book that has been reserved, with the name of the person who reserved it
    data class Reserved(val reservedBy: String) : BookStatus() {
        // Printing out the status of a reserved book
        override fun printStatus() = "This book is reserved by $reservedBy!"
    }

    // An abstract method that is overridden by each status to print the status message
    abstract fun printStatus(): String
}