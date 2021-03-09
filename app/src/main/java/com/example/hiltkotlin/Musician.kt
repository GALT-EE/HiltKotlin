package com.example.hiltkotlin

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Musician
@Inject
constructor(instrument: Instrument, band: Band) {
    fun sign() {
        print("working")
    }
}