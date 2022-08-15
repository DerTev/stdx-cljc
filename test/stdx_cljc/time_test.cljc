(ns stdx-cljc.time-test
  (:require [clojure.test :as test]
            [stdx-cljc.time :as time]))

(test/deftest seconds-to-hms-test
  (test/testing "Test seconds-to-hms"
                (test/is (= (time/seconds-to-hms 12000) {:hours 3
                        :minutes 20
                        :seconds 0}))))

(test/deftest seconds-to-hms-string-test
  (test/testing "Test seconds-to-hms-string"
    (test/is (= (time/seconds-to-hms-string 12000) "3:20:0"))))