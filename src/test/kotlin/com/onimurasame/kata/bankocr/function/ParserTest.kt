package com.onimurasame.kata.bankocr.function

import com.onimurasame.kata.bankocr.constant.NUMBERS_ARRAY
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ParserTest {

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
    fun arrayNumberToInt_test(number: Int) {
        Assertions.assertTrue(number == arrayNumberToInt(NUMBERS_ARRAY[number]))
    }

    @DisplayName("Account Number Parsing Test Case {}")
    @ParameterizedTest
    @ValueSource(strings = ["000000000", "111111111", "123456789", "222222222", "333333333", "444444444", "555555555", "666666666", "777777777", "888888888", "999999999"])
    fun parseAccountNumber_test(accountNumber: String) {
        val fileStr = this::class.java.classLoader.getResource("fixtures/${accountNumber}.txt").readText()
        //val file = File("src/test/resources/fixtures/accountNumbers.txt").readLines()
        //val file = readFile("src/test/resources/fixtures/accountNumbers.txt")

        val strArray = fileStr.split("\n")
        val parsedAccountNumber = parseAccountNumber(arrayOf(strArray[0], strArray[1], strArray[2]))
        println(parsedAccountNumber)
        assertEquals(accountNumber, parsedAccountNumber)

    }

}