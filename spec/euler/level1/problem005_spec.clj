(ns euler.level1.problem005-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem005 :refer :all]))

; 2520 is the smallest number that can be
; divided by each of the numbers from 1 to 10
; without any remainder.
; What is the smallest positive number
; that is evenly divisible by
; all of the numbers from 1 to 20?

; 2 * 2 * 3 = 12

; 2 = 2
; 3 = 3
; 4 = 2 2
; 5 = 5
; 6 = 2 3
; 7 = 7
; 8 = 2 2 2
; 9 = 3 3
; 10 = 2 5
; 11 = 11
; 12 = 2 2 3
; 13 = 13
; 14 = 2 7
; 15 = 3 5
; 16 = 2 2 2 2
; 17 = 17
; 18 = 2 3 3
; 19 = 19
; 20 = 2 2 5

(describe "smallest-multiple"

  (context "least common multiple"
    (it "is 1 with no input"
      (should= 1 (least-common-multiple [])))

    (it "is 2 with [2]"
      (should= 2 (least-common-multiple [2])))

    (it "is 2 with [1 2]"
      (should= 2 (least-common-multiple [1 2])))

    (it "is 4 with [2 4]"
      (should= 4 (least-common-multiple [2 4])))

    (it "is 2520 with range 1 11"
      (should= 2520 (least-common-multiple (range 1 11))))

    (it "is 232792560 with range 1 21"
      (should= 232792560 (least-common-multiple (range 1 21)))))

  (context "greatest common denominator"

    (it "is 1 if both are prime"
      (should= 1 (greatest-common-denominator 3 5)))

    (it "is first or second input number if first-number = second-number"
      (should= 3 (greatest-common-denominator 3 3)))

    (it "is second-number if second-number divides first-number"
      (should= 3 (greatest-common-denominator 6 3)))

    (it "is the largest number such that number divides first-number and second-number"
      (should= 4 (greatest-common-denominator 8 12)))
    )

  )

;(describe "Euler Problem 5"
;  (context "divisible?"
;    (it "finds least common denominator"
;      (should= 1 (smallest-divisible 1))
;      (should= 2 (smallest-divisible 2))
;      (should= 6 (smallest-divisible 3))
;      (should= 60 (smallest-divisible 5))
;      (should= 60 (smallest-divisible 6))
;      (should= 2520 (smallest-divisible 10))
;      (should= 360360 (smallest-divisible 15))
;      (should= 232792560 (smallest-divisible 20))
;      )
;    ))

(run-specs)