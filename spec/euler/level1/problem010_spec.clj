(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

;The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(describe "Euler Problem #10"

  (it "Solves #10"

    (should= 0 (euler-10 2))
    (should= 2 (euler-10 3))
    (should= 5 (euler-10 4))
    (should= 10 (euler-10 6))
    (should= 17 (euler-10 10))
    (should= 28 (euler-10 12))
    (should= 142913828922 (euler-10 2000000))
    )

  )

(run-specs)
