(ns test.core 
(:require [clojure.core.typed :as t]))

(t/ann ^:no-check clojure.data/diff [(t/U (t/List t/Any ) (t/HVec [t/Any *] )) (t/U (t/List t/Any ) (t/HVec [t/Any *] ))->  (t/HVec [t/Any *] )])

