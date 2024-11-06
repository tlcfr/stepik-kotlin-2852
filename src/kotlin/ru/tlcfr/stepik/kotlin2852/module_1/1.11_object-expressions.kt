package ru.tlcfr.stepik.kotlin2852.module_1

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(a: Int, b: Int): Int = b.compareTo(a)
    })
    return arrayList
}
