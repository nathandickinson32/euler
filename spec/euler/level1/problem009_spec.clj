(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; A Pythagorean triplet is a set of three natural numbers,
; a < b < c, for which, a^2 + b^2 = c^2
; for example, 3^2 +4^2 = 9 + 16 = 25 = 5^2.
; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
; Find the product abc

(describe "Euler Problem #9"

  (it "finds pythagorean triplets"
    (should= [] (pythagorean-triples 10))
    (should= [[3 4 5]] (pythagorean-triples 12))
    (should= [[200 375 425]] (pythagorean-triples 1000))
    )

  (it "declares if 3 numbers are pythagorean"
    (should= false (maybe-pythagorean? 1 2 3))
    (should= false (maybe-pythagorean? 3 4 6))
    (should= true (maybe-pythagorean? 3 4 5))
    (should= true (maybe-pythagorean? 5 12 13))
    (should= true (maybe-pythagorean? 8 15 17))
    (should= true (maybe-pythagorean? 200 375 425))
    )

  (it "gets triple product"
    (should= 0 (triple-product [0 1 2]))
    (should= 1 (triple-product [1 1 1]))
    (should= 60 (triple-product [3 4 5]))
    (should= 780 (triple-product [5 12 13]))
    )

  (it "Solves #9"
    (should= 31875000 (euler-9 1000))
    )

  )

(run-specs)
