package com.onimurasame.kata.bankocr.function

import com.onimurasame.kata.bankocr.constant.ACCOUNT_NUMBER_LENGTH
import com.onimurasame.kata.bankocr.constant.NONE
import com.onimurasame.kata.bankocr.constant.NUMBERS_ARRAY

fun parseAccountNumber(stringRepresentation: Array<String>): String {
    var accountNumber = ""

    stringRepresentation[0] = normalizeStringLength(stringRepresentation[0])
    stringRepresentation[1] = normalizeStringLength(stringRepresentation[1])
    stringRepresentation[2] = normalizeStringLength(stringRepresentation[2])

    for (i: Int in 0 until ACCOUNT_NUMBER_LENGTH * 3 step 3) {
        val isolatedNumberArray: Array<String> = arrayOf("", "", "")

        isolatedNumberArray[0] = stringRepresentation[0].slice(i..i + 2)
        isolatedNumberArray[1] = stringRepresentation[1].slice(i..i + 2)
        isolatedNumberArray[2] = stringRepresentation[2].slice(i..i + 2)


        accountNumber += parseNumber(isolatedNumberArray)

    }

    return accountNumber

}

fun parseNumber(stringNumber: Array<String>): Int {
    val numberArray: Array<BooleanArray> = NONE

    numberArray[0][0] = stringNumber[0].contains("_")

    for (i: Int in 1..2) {
        for (j: Int in 0..2) {
            numberArray[i][j] = !stringNumber[i][j].isWhitespace()
        }
    }

    return arrayNumberToInt(numberArray)
}

fun arrayNumberToInt(number: Array<BooleanArray>): Int {
    val numberOfPossibilities: Array<Int> = shortenNumberPossibilities(number)

    for (possibleNumber: Int in numberOfPossibilities) {
        if (number contentDeepEquals NUMBERS_ARRAY[possibleNumber]) {
            return possibleNumber
        }
    }

    return -1
}

private fun normalizeStringLength(string: String): String {
    return string.padEnd(27)
}

private fun shortenNumberPossibilities(number: Array<BooleanArray>): Array<Int> {
    return when {
        !number[0][0] -> arrayOf(1, 4)
        !number[1][1] -> arrayOf(0, 7)
        !number[1][0] -> arrayOf(2, 3)
        else -> arrayOf(5, 6, 8, 9)
    }
}