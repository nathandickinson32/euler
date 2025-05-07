(ns euler.level1.problem003)

(defn euler-3 [n]
  (loop [n n factor 2]
    (cond
      (> (* factor factor) n) n
      (zero? (mod n factor)) (recur (/ n factor) factor)
      :else (recur n (inc factor)))))