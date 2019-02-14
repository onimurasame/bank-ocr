package com.onimurasame.kata.bankocr.constant

val NONE = arrayOf(
    booleanArrayOf(false),
    booleanArrayOf(false, false, false),
    booleanArrayOf(false, false, false)
)

/*
    123
1    _
2   | |
3   |_|
4
 */

val ZERO = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, false, true),
    booleanArrayOf(true, true, true)
)

/*
    123
1
2     |
3     |
4
 */

val ONE = arrayOf(
    booleanArrayOf(false),
    booleanArrayOf(false, false, true),
    booleanArrayOf(false, false, true)
)

/*
    123
1    _
2    _|
3   |_
4
 */

val TWO = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(false, true, true),
    booleanArrayOf(true, true, false)
)

/*
    123
1    _
2    _|
3    _|
4
 */

val THREE = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(false, true, true),
    booleanArrayOf(false, true, true)
)

/*
    123
1
2   |_|
3     |
4
 */

val FOUR = arrayOf(
    booleanArrayOf(false),
    booleanArrayOf(true, false, true),
    booleanArrayOf(false, false, true)
)

/*
    123
1    _
2   |_
3    _|
4
 */

val FIVE = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, true, false),
    booleanArrayOf(false, true, true)
)

/*
    123
1    _
2   |_
3   |_|
4
 */

val SIX = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, true, false),
    booleanArrayOf(true, true, true)
)

/*
    123
1    _
2     |
3     |
4
 */

val SEVEN = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(false, false, true),
    booleanArrayOf(false, false, true)
)

/*
    123
1    _
2   |_|
3   |_|
4
 */

val EIGHT = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, true, true),
    booleanArrayOf(true, true, true)
)

/*
    123
1    _
2   |_|
3    _|
4
 */

val NINE = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, true, true),
    booleanArrayOf(false, false, true)
)

val NUMBERS_ARRAY = arrayOf(
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
)