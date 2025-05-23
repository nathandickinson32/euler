(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

  (it "Solves #12"
    (should= -1 (euler-12 -1)))
  )

(run-specs)
