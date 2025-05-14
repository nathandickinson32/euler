(ns euler.level1.problem007)

(defn euler-7 [limit]
  (loop [primes [2]
         cursor 3]
    (if (= (count primes) limit)
      (last primes)
      (let [is-prime (not-any? #(zero? (mod cursor %)) primes)]
        (recur
          (if is-prime (conj primes cursor) primes)
          (inc cursor))))))

; lazy-seq to only compute prime list when needed?