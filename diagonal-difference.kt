fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primary = 0
    var secondary = 0
    for (i in arr.indices) {
        primary += arr[i][i]
        secondary += arr[i][arr.size - 1 - i]
    }
    return Math.abs(primary - secondary)
}

