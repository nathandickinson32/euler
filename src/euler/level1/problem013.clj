(ns euler.level1.problem013)

(defn ->substring-number [string-number]
  (subs string-number 0 10))

(defn too-small? [string-number]
  (<= (count string-number) 10))

(defn ->substring? [string-number]
  (if (too-small? string-number)
    string-number
    (->substring-number string-number)))

(defn ->string-number [n]
  (let [string-number (str n)]
    (->substring? string-number)))

(defn ->sum-of-numbers [numbers]
  (->> numbers
       (flatten)
       (reduce +)))

(defn euler-13 [numbers]
  (-> numbers
      (->sum-of-numbers)
      (->string-number)))