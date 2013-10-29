package com.hasanozgan.codekata.primefactors

object PrimeFactors {
    def of(n:Int) = {
        def tryFactor(n:Int, divider:Int) : List[Int]  =
            if (n == 1) Nil
            else if (n % divider == 0) divider :: tryFactor(n/divider, divider)
            else tryFactor(n, divider+1)
 
        tryFactor(n, 2)
    }
}
