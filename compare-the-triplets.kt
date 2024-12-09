fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aPoints = 0
    var bPoints = 0
    
    for (i in a.indices) {
        if (a[i] > b[i]) {
            aPoints += 1
        } else if (a[i] < b[i]) {
            bPoints += 1
        }
    }
    
    return arrayOf(aPoints, bPoints)
}

