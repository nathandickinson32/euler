(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "finds the multiples of x of n when x = 5"
    (should= [] (get-multiples-of-x 0 5))
    (should= [] (get-multiples-of-x 1 5))
    (should= [] (get-multiples-of-x 2 5))
    (should= [] (get-multiples-of-x 3 5))
    (should= [] (get-multiples-of-x 4 5))
    (should= [] (get-multiples-of-x 5 5))
    (should= [5] (get-multiples-of-x 6 5))
    (should= [5] (get-multiples-of-x 7 5))
    (should= [5] (get-multiples-of-x 8 5))
    (should= [5] (get-multiples-of-x 9 5))
    (should= [5] (get-multiples-of-x 10 5))
    (should= [5 10] (get-multiples-of-x 11 5))
    )
  (it "finds the multiples of x of n when x = 3"
    (should= [] (get-multiples-of-x 0 3))
    (should= [] (get-multiples-of-x 1 3))
    (should= [] (get-multiples-of-x 2 3))
    (should= [] (get-multiples-of-x 3 3))
    (should= [3] (get-multiples-of-x 4 3))
    (should= [3] (get-multiples-of-x 5 3))
    (should= [3] (get-multiples-of-x 6 3))
    (should= [3 6] (get-multiples-of-x 7 3))
    (should= [3 6] (get-multiples-of-x 8 3))
    (should= [3 6] (get-multiples-of-x 9 3))
    (should= [3 6 9] (get-multiples-of-x 10 3))
    )

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 45 (euler-1 15))
    (should= 233168 (euler-1 1000)))
  )

(run-specs)
