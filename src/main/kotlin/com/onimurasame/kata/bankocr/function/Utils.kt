package com.onimurasame.kata.bankocr.function

import java.io.File

fun readFile(filename: String): List<String> = File(filename).useLines { it.toList() }