/**
 * Hacker rank algorithms
 */

fun main(){


    }

/**
 * Sub Array division
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var sum = 0
    var r = 0
    for (i in 0 until s.size) {
        sum += s[i]
        // M is never less than 1
        if (i > m - 1) sum -= s[i - m]
        if (i >= m - 1 && sum == d) r++
    }
    return r
}

/**
 * Breaking the record
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var numOfMax = 0
    var numOfMin = 0
    var maxNum = 0
    var minNum = 0

    for (i in 0 until scores.size) {
        val currentNum = scores[i]
        if (i != 0) {
            if (currentNum > maxNum) {
                maxNum = currentNum
                numOfMax++
            } else if (currentNum < minNum) {
                minNum = currentNum
                numOfMin++
            }
        } else {
            maxNum = currentNum
            minNum = currentNum
        }
    }

    return arrayOf(numOfMax, numOfMin)

}


/**
 * Betweeen two sets
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    var total = 0
    for (num in 1..100) {
        var inrange = true
        for (i in 0 until b.size) {
            val it = b[i]
            if (it % num != 0) {
                inrange = false
                break
            }
        }
        if (inrange) {
            for (i in 0 until a.size) {
                val it = a[i]
                if (num % it != 0) {
                    inrange = false
                    break
                }
            }
        }
        if (inrange) {
            total++
        }
    }
    return total
}


/**
 * Kangaroo
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    var n = 0

    while( n < 10000) {

        if (x1 + n * v1 == x2 + n * v2) {
            return "YES"
        } else
            n++
    }
    return "NO"
}


/**
 * Apples and oranges
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var d = 0
    var p = 0
    for (i in apples) {
        if ((a + i) in  s..t)
            d++
    }

    for (j in oranges) {
        if(b + j in s..t)
            p++
    }
    println(d)
    println(p)
}

/**
 * Grading Students
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    var finalGrade: MutableList<Int> = ArrayList()

    grades.forEach() { i ->
        if (i >= 38 && i % 5 > 2) {
            val total = i + (5 - i % 5)
            finalGrade.add(total)
        } else {
            finalGrade.add(i)
        }
    }
    return finalGrade.toTypedArray()

}


/**
 * Leet Code
 * Binary Search
 */

fun search(nums: IntArray, target: Int): Int {

    var result: Int = -1

    for (i in nums.indices) {
        if (nums[i] == target) {
            result = i
        }
    }

    return result
}


/**
 * Time conversion
 */

fun timeConversion(s: String): String {
    // Write your code here
    var currTime = ""
    var firstDigits = s.take(2).toInt()
    var endTime = s.substring(3,8)

    println(endTime)
    println(s.takeLast(2))
    if(s.takeLast(2) == "AM" && s.take(2) == "12"){
       currTime = "00:$endTime"
    } else if (s.takeLast(2) == "PM" && s.take(2) == "12"){
        currTime = s.take(8)
    } else if(s.takeLast(2) == "AM") {
        currTime = s.take(8)
    } else {
        currTime ="${firstDigits+12}:$endTime"
    }

    println(currTime)
    return currTime
}


/**
 * Birthday Candle
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var count = 0
    candles.sort()
    var high = candles[candles.lastIndex]

    println(high)
    for (i in candles.indices) {
        if(candles[i] == high) {
            count++
        }
    }
    println(count)
    return count
}


/**
 *Mini-Max_Sum
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here

    var max = arr[0]
    var min = arr[0]
    var sum = arr[0].toLong()

    for (i in 1 until arr.size){
        sum += arr[i]

        if (min > arr[i]) {
            min = arr[i]
        } else if (max < arr[i]) {
            max = arr[i]
        }
    }

    println("${sum - max} ${sum - min}")

}

/**
 * StairCase
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for( i in 1..n) {
        println(" ".repeat(n-i) + "#".repeat(i))
    }
}


/**
 * Plus Minus
 */

fun plusMinus(arr: Array<Int>): Unit {

    var positiveValues: Int= 0
    var negativeValues:Int = 0
    var zeros: Int= 0

    for (i in arr) {
        if (i > 0 )
            positiveValues++
        else if (i < 0)
            negativeValues++
        else zeros++
    }
    var positive:Double = positiveValues.toDouble()/arr.size.toDouble()
    var negative:Double = negativeValues.toDouble()/arr.size.toDouble()
    var zeroProp:Double = zeros.toDouble()/arr.size.toDouble()

    println(positive)
    println(negative)
    println(zeroProp)

}

/**
 * Diagonal Difference
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var rightDiagonal = 0
    var leftDiagonal = 0

    for (i in 0 until arr.size)  {
        rightDiagonal += arr[i][arr.size-1-i]
        leftDiagonal += arr[i][i]
    }
    var absolute = Math.abs(leftDiagonal - rightDiagonal)
    println(absolute)
    return absolute
}


/**
 * A very big sum
 */

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L
    for (i in ar) {
        sum += i
    }
    return sum

    // return ar.sum()
}

/**
 * Compare triplets
 */


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0
    for (i in 0 until a.size) {

        if (a[i] > b[i])
            alice++
        else if (a[i] < b[i])
            bob++
    }

    println(arrayOf(alice, bob))
    return  arrayOf(alice, bob)

}

/**
 * Simple Array sum
 */

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (i in ar) {
        sum += i
    }
    println(sum)
    return sum
}


/**
 * Solve me first
 */

fun solveMeFirst(a: Int, b: Int): Int {
    val sum = a + b
    println(sum)
    return sum
}
