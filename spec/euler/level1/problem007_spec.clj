(ns euler.level1.problem007-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem007 :refer :all]))

;By listing the first six prime numbers:
; 2, 3, 5, 7, 11, 13, we can see the 6th prime 13.
; What is the 10,001st prime number

(describe "Euler Problem 7"
  (context "prime numbers"
    (it "returns list of prime numbers up to a range"
      (should= 1 (prime-list 2)))))
