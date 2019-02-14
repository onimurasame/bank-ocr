package com.onimurasame.kata.bankocr.function

import com.onimurasame.kata.bankocr.constant.NUMBERS_ARRAY
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ReadingFunctionsTest {

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
    fun readNumberFromArray_test(number: Int) {
        Assertions.assertTrue(number == readNumberFromArray(NUMBERS_ARRAY[number]))
    }

    @ParameterizedTest
    @ValueSource(strings = ["000000000", "111111111", "123456789", "222222222"])
    fun readNumberFromStringRepresentation_test(accountNumber: String) {
        val fileStr = this::class.java.classLoader.getResource("fixtures/${accountNumber}.txt").readText()
        //val file = File("src/test/resources/fixtures/accountNumbers.txt").readLines()
        //val file = readFile("src/test/resources/fixtures/accountNumbers.txt")

        val strArray = fileStr.split("\n")
        val parsedAccountNumber = readEntireNumberFromString(arrayOf(strArray[0], strArray[1], strArray[2]))
        println(parsedAccountNumber)
        assertEquals(accountNumber, parsedAccountNumber)

    }

}