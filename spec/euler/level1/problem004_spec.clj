(ns euler.level1.problem004-spec
  (:require [speclj.core :refer :all]
            [euler.level1.problem004 :refer :all]))

;A palindromic number reads the same both ways.
; The largest palindrome made from the product
; of two 2-digit numbers is
; 9009 = 91 x 99.
; Find the largest palindrome made from the product
; of two 3-digit numbers.

(describe "Euler Problem 4"
  (context "palindromes"

    (it "should be false when given a non-palindrome"
      (should= false (palindrome? 100))
      (should= false (palindrome? 1100))
      (should= false (palindrome? 10100))
      (should= false (palindrome? 100100))
      (should= false (palindrome? 1000010))
      )

    (it "true when given a palindrome"
      (should= true (palindrome? 101))
      (should= true (palindrome? 1001))
      (should= true (palindrome? 10001))
      (should= true (palindrome? 102201))
      (should= true (palindrome? 1002001))
      (should= true (palindrome? 10022001))
      )

    (context "solves euler 4"

      (it "returns largest palindrome for input number of digits"
        (should= nil (euler-4 0))
        (should= nil (euler-4 1))
        (should= 9009 (euler-4 2))
        (should= 906609 (euler-4 3))
        )
      )
    )
  )
(run-specs)