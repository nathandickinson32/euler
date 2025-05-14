(ns euler.level1.problem008)

(defn multiply-digits [n]
  (reduce * (map #(Integer/parseInt (str %)) (str n))))

(defn sliding-substring [digit-as-string substring-length]
  (map #(apply str %) (partition substring-length 1 digit-as-string)))

(defn max-product [digit-as-string substring-length]
  (->> (sliding-substring digit-as-string substring-length)
       (map multiply-digits)
       (apply max)))


; 1000 digit number
; get the product of first 13 digits
; move one digit over
; get product of those 13 digits
; compare and take larger
; keep shifting one digit and getting 13 digit product
; keep comparing and keeping largest product
; go through 1000 digit number
