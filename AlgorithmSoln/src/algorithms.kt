/**
 * Hacker rank algorithms
 */

fun main(){

    }

/**
 * Strange Counter
 */

fun strangeCounter(t: Long): Long {
    // Write your code here
    
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
