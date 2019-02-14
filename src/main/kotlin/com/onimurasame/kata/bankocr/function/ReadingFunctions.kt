package com.onimurasame.kata.bankocr.function

import com.onimurasame.kata.bankocr.constant.numbersArray
import com.onimurasame.kata.bankocr.constant.zero

fun readNumberFromStringRepresentation(stringRepresentation: Array<String>): String {
    var accountNumber = ""

    for (i: Int in 0..8) {
        var numberArrayRepresentation: Array<BooleanArray> = zero
        for (j: Int in 0..2) {
            for (k: Int in 0..2) {
                var line = stringRepresentation[j]
                if (j == 0) {
                    if (!line[1 + (3 * i)].equals(' ')) {
                        numberArrayRepresentation[0][0] = true
                    }
                } else {
                    if (!line[j + (3 * i)].equals(' ')) {
                        numberArrayRepresentation[j][k] = true
                    }
                }
            }
        }

        accountNumber += readNumberFromArray(numberArrayRepresentation)
    }


    return accountNumber
}

fun readNumberFromArray(number: Array<BooleanArray>): Int {
    val numberOfPossibilities: Array<Int> = shortenNumberPossibilities(number)

    for (possibleNumber: Int in numberOfPossibilities) {
        if (number contentDeepEquals numbersArray[possibleNumber]) {
            return possibleNumber
        }
    }

    return -1
}

private fun shortenNumberPossibilities(number: Array<BooleanArray>): Array<Int> {
    return when {
        !number[0][0] -> arrayOf(1, 4)
        !number[1][1] -> arrayOf(0, 7)
        !number[2][1] -> arrayOf(9)
        !number[1][0] -> arrayOf(2, 3)
        else -> arrayOf(5, 6, 8)
    }
}