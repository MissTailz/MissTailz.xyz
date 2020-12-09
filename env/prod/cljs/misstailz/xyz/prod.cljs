(ns misstailz.xyz.prod
  (:require [misstailz.xyz.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
