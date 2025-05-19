(ns euler.level1.core)

(defn square [n] (* n n))

(defn is-prime? [cursor primes]
  (not-any? #(zero? (mod cursor %))
            (take-while #(<= (square %) cursor) primes)))


;10
;2 x 50    50 x 2
;4 x 25    25 x 4
;5 x 20    20 x 5
;10 x 10   10 x 10
; we know 50 is a factor when we know 2 is a factor
;
; 23  √23 ~ 4.7
; (cursor) <= (current prime^2) == (√cursor) >= (current prime)
; [primes 2 3 5 7 11 13 17 19]
; 23/2 = 20.5   2 x 2 = 4  4 < 23
; 23/3 = 13.6   3 x 3 = 9  9 < 23
; 23/5 = 4.6    5 x 5 = 25 25 > 23

