(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; A Pythagorean triplet is a set of three natural numbers,
; a < b < c, for which, a^2 + b^2 = c^2
; for example, 3^2 +4^2 = 9 + 16 = 25 = 5^2.
; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
; Find the product abc


; 3 numbers a b c
; must be < order (3 4 5)
; check for pythagorean
; check if a + b + c = 1000
; return a * b * c




(describe "Euler Problem #9"

  (it "declares if 3 numbers are pythagorean"
    (should= false (maybe-pythagorean? 1 2 3))
    (should= true (maybe-pythagorean? 3 4 5))
    (should= true (maybe-pythagorean? 8 15 17))
    )

  (it "finds-triplets"
    (should= [[3 4 5]] (find-triplets 12))
    )

  (it "gets triple product"
    (should= 60 (triple-product [3 4 5]))
    )

  (it "Solves #9"
    (should= 31875000 (euler-9 1000))
    )

  )

(run-specs)
