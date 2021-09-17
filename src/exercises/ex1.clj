(ns exercises.ex1)

(defn -main [& args]
  (println "What is your name?")
  (let [your-name (read-line)]
    (printf "Hello, %s, nice to meet you!" your-name)))
