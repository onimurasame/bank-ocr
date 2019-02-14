package com.onimurasame.kata.bankocr.constant

/*
    123
1    _
2   | |
3   |_|
4
 */

val zero = arrayOf(
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

val one = arrayOf(
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

val two = arrayOf(
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

val three = arrayOf(
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

val four = arrayOf(
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

val five = arrayOf(
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

val six = arrayOf(
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

val seven = arrayOf(
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

val eight = arrayOf(
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

val nine = arrayOf(
    booleanArrayOf(true),
    booleanArrayOf(true, true, true),
    booleanArrayOf(false, false, true)
)

val numbersArray = arrayOf(
    zero, one, two, three, four, five, six, seven, eight, nine
)