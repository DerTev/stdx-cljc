(defproject de.dertev/stdx-cljc "0.2.0"
  :description "Standart Library Extensions for Clojure and ClojureScript"
  :url "https://github.com/dertev/stdx-cljc"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :repositories [["releases" {:url "https://repo.devcord.club/releases"
                              :username :env/devcord_username
                              :password :env/devcord_password}]]
  :plugins [[lein-codox "0.10.8"]]
  :codox {:source-uri "https://github.com/DerTev/stdx-cljc/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
