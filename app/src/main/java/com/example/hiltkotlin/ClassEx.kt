package com.example.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassEx
@Inject constructor(
    @FirstImplementor private val interfaceImplementor: MyInterface,
    private val gson: Gson,
    @SecondImplementor private val ndInterfaceImp: MyInterface
) {
    fun myFunc(): String {
        return "Working: ${interfaceImplementor.printFunc()}"
    }

    fun ndFunc(): String {
        return "Working ${ndInterfaceImp.printFunc()}"
    }
}