package ru.tlcfr.stepik.kotlin2852.module_1

fun containsEven(collection: Collection<Int>): Boolean = collection.any { n -> n % 2 == 0 }
