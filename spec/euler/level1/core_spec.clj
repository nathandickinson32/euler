(ns euler.level1.core-spec
  (:require [speclj.core :refer :all]
            [euler.level1.core :refer :all]))

(describe "core tests"

  (it "squares the input"
    (should= 0 (square 0))
    (should= 1 (square 1))
    (should= 4 (square 2))
    (should= 9 (square 3))
    (should= 16 (square 4))
    )

  (it "return false if cursor is not prime"
    (should= false (is-prime? 4 [2 3]))
    (should= false (is-prime? 6 [2 3]))
    (should= false (is-prime? 9 [2 3 5 7]))
    )

  (it "return true if cursor is prime"
    (should= true (is-prime? 3 [2]))
    (should= true (is-prime? 5 [2 3]))
    (should= true (is-prime? 7 [2 3 5]))
    (should= true (is-prime? 11 [2 3 5 7]))
    )

  )