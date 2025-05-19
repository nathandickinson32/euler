(ns euler.level1.problem005)

(defn greatest-common-denominator [first-number second-number]
  (if (zero? second-number)
    first-number
    (recur second-number (mod first-number second-number))))

(defn least-common-multiple
  ([first-number second-number]
   (/ (* first-number second-number)
      (greatest-common-denominator first-number second-number)))
  ([range-of-numbers]
   (reduce least-common-multiple 1 range-of-numbers)))


(int (dec (gcd 1 2 num)))
(->> num
     (gcd 1 2)
     dec
     int)


(int (dec (lcd num 1 2)))

(-> num
     (lcd 1 2)
     dec
     int)

(int (dec (mel 1 num 2)))

(-> (mel 1 num 2)
    dec
    int)