package ru.tlcfr.stepik.kotlin2852.module_1

data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
