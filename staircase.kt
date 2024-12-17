fun staircase(n: Int): Unit {
    for (i in 1..n) {
        for (j in 1..n-i) {
            print(" ")
        }
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

