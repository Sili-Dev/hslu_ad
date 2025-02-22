package org.hslu.ex_1

class SymmetricNumbers {

    fun isNumberSymmetric(n: Int): Boolean {
        val str = n.toString()
        val firsHalf = str.substring(str.length / 2)
        val secondHalf = str.reversed().substring(str.length / 2)
        return firsHalf == secondHalf
    }

}