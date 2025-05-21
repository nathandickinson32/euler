(ns euler.level1.problem010
  (:require [euler.level1.core :as core]))

(defn maybe-add-to-primes [cursor primes]
  (if (core/is-prime? cursor primes)
    (conj primes cursor)
    primes))

(defn sum-up-primes [primes cursor target]
  (if (= cursor target)
    (apply + primes)
    (recur
      (maybe-add-to-primes cursor primes)
      (inc cursor) target)))

(defn euler-10 [target]
  (let [primes []
        cursor 2]
   (sum-up-primes primes cursor target)))