package com.example.hotelreservation

class IsNum {
    // 입력받은 값이 숫자인지 검증하여 숫자면 true, 아니면 false를 반환
    fun isNum(string: String) : Boolean {
        var input : Char
        var result = true

        for (i in 0 until string.length) {
            input = string.elementAt(i)
            if (input.toInt() < 48 || input.toInt() > 57) {
                result = false
            }
        }
        return result
    }
}