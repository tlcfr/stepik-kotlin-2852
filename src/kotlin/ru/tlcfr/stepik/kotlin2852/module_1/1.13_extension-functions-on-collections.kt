package ru.tlcfr.stepik.kotlin2852.module_1

//fun getList(): List<Int> {
fun getList(): List<Int> { // conflicts (1.11, 1.12)
    return arrayListOf(1, 5, 2).sortedDescending()
}
