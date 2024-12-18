package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),            // Describing the Fiction genre
    NON_FICTION("Non-fictional stories and novels"),    // Describing the Non-Fiction genre
    SCIENCE("Scientific books"),                        // Describing the Science genre
    HISTORY("Historical stories and novels"),           // Describing the History genre
    CHILDREN("Books with topics for children");         // Describing the Children genre

    // Printing the description of the genre
    fun printDescription() {
        println(description)
    }
}