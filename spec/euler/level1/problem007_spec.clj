(ns euler.level1.problem007-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem007 :refer :all]))

;By listing the first six prime numbers:
; 2, 3, 5, 7, 11, 13, we can see the 6th prime 13.
; What is the 10,001st prime number
;
; nth 3 prime list

(describe "Euler Problem 7"

  (context "prime numbers"

    (it "returns nth prime number"

      (should= 2 (euler-7 1))
      (should= 3 (euler-7 2))
      (should= 5 (euler-7 3))
      (should= 7 (euler-7 4))
      (should= 11 (euler-7 5))
      (should= 13 (euler-7 6))
      (should= 104743 (euler-7 10001))
      )

    )
  )
