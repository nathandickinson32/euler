(ns euler.level1.problem011)

(defn ->diagonal-range [grid n]
  (range (- (count grid) (dec n))))

(defn ->columns [grid column-index n]
  (partition n 1 (map #(nth % column-index) grid)))

(defn ->max-row-product [grid n]
  (apply max
         (for [row grid
               window (partition n 1 row)]
           (apply * window))))

(defn ->max-column-product [grid n]
  (apply max
         (for [column-index (range (count (first grid)))
               columns (->columns grid column-index n)]
           (apply * columns))))

(defn ->max-down-right-diagonal-product [grid n]
  (apply max
         (for [start-row (->diagonal-range grid n)
               start-column (->diagonal-range grid n)]
           (apply * (for [i (range n)]
                      (get-in grid [(+ start-row i) (+ start-column i)]))))))

(defn ->max-down-left-diagonal-product [grid n]
  ;(for [start-row (->diagonal-range grid n)
  ;      start-column (range (dec n) (count (first grid)))]
  ;  (for [i (range n)]
  ;    (get-in grid [(+ start-row i) (- start-column i)])))
  (apply max
         (for [start-row (->diagonal-range grid n)
               start-column (range (dec n) (count (first grid)))]
           (apply *
                  (for [i (range n)]
                    (get-in grid [(+ start-row i) (- start-column i)]))))))

(defn euler-11 [grid n]
  ;(->> (concat
  ;       (row-windows grid n)
  ;       (column-windows grid n)
  ;       (right-diagonal-windows grid n)
  ;       (left-diagonal-windows grid n))
  ;     (map #(apply * %))
  ;     (apply max))

  (apply max
         [(->max-row-product grid n)
          (->max-column-product grid n)
          (->max-down-right-diagonal-product grid n)
          (->max-down-left-diagonal-product grid n)]))


