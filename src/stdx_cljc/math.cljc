(ns stdx-cljc.math)

(defn between
  "Checks, if *number* is between *x* and *y*."
  [number x y]
  (and (> number x) (< number y)))