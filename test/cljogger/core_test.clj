(ns cljogger.core-test
  (:require [midje.sweet :refer [fact facts => throws] :as m]
            [cljogger.macros :refer :all]))

(init-logger)

(fact "testing"
  true => true)
