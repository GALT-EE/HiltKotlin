package com.example.hiltkotlin

import javax.inject.Inject

class ndInterfaceImp
@Inject constructor() : MyInterface
{
    override fun printFunc(): String{
        return "my 2nd interface imp"
    }
}