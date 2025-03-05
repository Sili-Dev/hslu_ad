package org.hslu.ex_3.binary_mathematical_tree

enum class Operation(val operator: Char, val compiler: String) {
    ADDITION('+', "ADD"), SUBTRACTION('-', "SUB"), MULTIPLICATION('*', "MUL"), DIVISION('/', "DIV")
}