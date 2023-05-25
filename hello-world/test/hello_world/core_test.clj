(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest test-main
  (testing "Main function"
    (with-out-str
      (-main)
      (is (= "Hello, World!\n" (with-out-str (-main)))))))
