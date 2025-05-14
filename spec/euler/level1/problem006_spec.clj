(ns euler.level1.problem006-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem006 :refer :all]))

;The sum of the squares of the first ten natural
; numbers is, 1^2 + 2^2 + ... + 10^2 = 385
; The square of the sum of the first ten natural
; numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
; Hence the difference between the sum of the
; squares of the first ten natural numbers and the
; square of the sum is 3025 - 385 = 2640
; Find the difference between the sum of the squares
; of the first one hundred natural numbers and
; the square of the sum

(describe "Euler problem 6"

  #_(it "evaluates the sum of squares"
    (let [initial-sum 0]

      (should= 1 (sum-of-squares 1 initial-sum))
      (should= 5 (sum-of-squares 2 initial-sum))
      (should= 14 (sum-of-squares 3 initial-sum))
      (should= 30 (sum-of-squares 4 initial-sum))
      (should= 55 (sum-of-squares 5 initial-sum))
      (should= 91 (sum-of-squares 6 initial-sum))
      (should= 140 (sum-of-squares 7 initial-sum))
      (should= 204 (sum-of-squares 8 initial-sum))
      (should= 285 (sum-of-squares 9 initial-sum))
      (should= 385 (sum-of-squares 10 initial-sum))
      (should= 338350 (sum-of-squares 100 initial-sum))

      ))

  (context "sum of the squares of the first x amount of natural numbers"

    (it "returns sum of squares"

      (let [initial-sum 0]

        (should= 1 (sum-of-squares 1 initial-sum))
        (should= 5 (sum-of-squares 2 initial-sum))
        (should= 14 (sum-of-squares 3 initial-sum))
        (should= 30 (sum-of-squares 4 initial-sum))
        (should= 55 (sum-of-squares 5 initial-sum))
        (should= 91 (sum-of-squares 6 initial-sum))
        (should= 140 (sum-of-squares 7 initial-sum))
        (should= 204 (sum-of-squares 8 initial-sum))
        (should= 285 (sum-of-squares 9 initial-sum))
        (should= 385 (sum-of-squares 10 initial-sum))
        (should= 338350 (sum-of-squares 100 initial-sum))

        )

      )

    )

  (context "square of the sum of the first x amount of natural numbers"

    (it "returns square of sums"

      (let [initial-sum 0]

        (should= 1 (square-of-sums 1 initial-sum))
        (should= 9 (square-of-sums 2 initial-sum))
        (should= 36 (square-of-sums 3 initial-sum))
        (should= 100 (square-of-sums 4 initial-sum))
        (should= 3025 (square-of-sums 10 initial-sum))
        (should= 25502500 (square-of-sums 100 initial-sum))

        )

      )

    )

  (context "solves euler 6"

    (it "finds the difference between the sum of the squares
    of the first one hundred natural numbers and the square of the sum"

      (should= 0 (euler-4 0))
      (should= 0 (euler-4 1))
      (should= 4 (euler-4 2))
      (should= 22 (euler-4 3))
      (should= 70 (euler-4 4))
      (should= 2640 (euler-4 10))
      (should= 25164150 (euler-4 100))

      )

    )

  )
