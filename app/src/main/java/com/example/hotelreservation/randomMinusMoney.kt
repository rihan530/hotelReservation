package com.example.hotelreservation

import java.util.Random

class randomMinusMoney {
    fun randomMinusMoney(): Int {
        return Random().nextInt(1 - 99)*1000
    }
}