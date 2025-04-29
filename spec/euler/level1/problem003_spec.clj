(ns euler.level1.problem003-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem003 :refer :all]))

; The prime factors of 13195 are 5,7 13 and 29.
; What is the largest prime factor of the number 600851475143?

(describe "Euler Problem 3"

  (context "euler-3"

    (it "gets highest prime factorial for n"
      (should= 0 (euler-3 0))
      (should= 1 (euler-3 1))
      (should= 2 (euler-3 2))
      (should= 3 (euler-3 3))
      (should= 2 (euler-3 4))
      (should= 5 (euler-3 5))
      (should= 3 (euler-3 6))
      (should= 7 (euler-3 7))
      (should= 2 (euler-3 8))
      (should= 3 (euler-3 9))
      (should= 5 (euler-3 10))
      (should= 11 (euler-3 11))
      (should= 3 (euler-3 12))
      (should= 13 (euler-3 13))
      (should= 29 (euler-3 13195))
      (should= 6857 (euler-3 600851475143))
      )
    )
  )
(run-specs)