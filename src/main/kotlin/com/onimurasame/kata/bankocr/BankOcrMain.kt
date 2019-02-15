package com.onimurasame.kata.bankocr

import com.onimurasame.kata.bankocr.function.parseAccountNumber
import com.onimurasame.kata.bankocr.function.readFile

fun main(args: Array<String>) {

    val inputAccountNumbers: List<String> = readFile(if (args.isEmpty()) "src/main/resources/accountNumbers.txt" else args[0])

    for(i: Int in 0 until inputAccountNumbers.size - 1 step 4) {
        val inputAccountNumber : Array<String> = arrayOf("", "", "")

        inputAccountNumber[0] = inputAccountNumbers[i]
        inputAccountNumber[1] = inputAccountNumbers[i + 1]
        inputAccountNumber[2] = inputAccountNumbers[i + 2]

        println("=> ${parseAccountNumber(inputAccountNumber)}")
    }

}