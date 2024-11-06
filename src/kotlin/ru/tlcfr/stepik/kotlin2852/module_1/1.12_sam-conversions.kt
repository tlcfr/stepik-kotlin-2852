package ru.tlcfr.stepik.kotlin2852.module_1

import java.util.*

//fun getList(): List<Int> {
fun samConversions(): List<Int> { // conflicts (1.11, 1.13)
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList) { x, y -> y.compareTo(x) }
    return arrayList
}
