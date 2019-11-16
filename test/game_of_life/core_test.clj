(ns game-of-life.core-test
  (:require [clojure.test :refer :all]
            [game-of-life.core :refer :all]))


(deftest single-cell-dies
  (testing "Single cell dies"
    (is (= 0 (count (step (create-world [[0 1]])))))))

(deftest three-cells-live
  (testing "3 cells together live"
    (is (= 3 (count (step (create-world [[0 1] [0 0] [1 0]])))))))


