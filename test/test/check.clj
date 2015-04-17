(ns test.check
(:require [clojure.core.typed :as t]
                [clojure.data :as data]
                [test.core]))


(data/diff '[1 2 3] '[1 2])

