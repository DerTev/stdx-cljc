(ns stdx-cljc.time)

(defn seconds-to-hms
  "Seconds to hours, minutes and seconds"
  [seconds]
  {:hours (quot seconds 3600)
   :minutes (mod (quot seconds 60) 60)
   :seconds (mod seconds 60)})

(defn seconds-to-hms-string
  "Format seconds to a human readable hms string"
  [seconds]
  (let [hms (seconds-to-hms seconds)]
    (str (get hms :hours) ":" (get hms :minutes) ":" (get hms :seconds) "")))