(defproject iota "1.1.2"
  :description        "Allows Clojure's reducers to operate over mmap()'ed text files"
  :url                "https://github.com/thebusby/iota"
  :license            {:name "MIT"
                       :url "http://opensource.org/licenses/MIT"}
  :dependencies       [[org.clojure/clojure "1.6"]
                       [org.codehaus.jsr166-mirror/jsr166y "1.7.0"] ;; To support reducers on Java 1.6
                       ]
  :source-paths       ["src/clj"]
  :java-source-paths  ["src/java"]
  :source-path        "src/clj"
  :java-source-path   "src/java")
