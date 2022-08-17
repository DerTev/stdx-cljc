(ns stdx-cljc.math-test
  (:require [clojure.test :as test]
            [stdx-cljc.math :as math]))

(test/deftest between-test
  (test/testing "Test between"
    (test/is (= (math/between 2 1 3) true))
    (test/is (= (math/between 1 2 3) false))))