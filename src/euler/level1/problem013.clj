(ns euler.level1.problem013)

(defn ->first-ten-digits [string-number]
  (->> string-number (take 10) (apply str)))

(defn ->string-number [n]
  (let [string-number (str n)]
    (->first-ten-digits string-number)))

(defn ->sum-of-numbers [numbers]
  (->> numbers
       flatten
       (apply +)))

(defn euler-13 [numbers]
  (-> numbers
      ->sum-of-numbers
      ->string-number))