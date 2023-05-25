(ns hello-world.core
;;   This line is declaring a namespace for the code that follows. In Clojure, a
;;   namespace is a container for named entities such as vars, functions, and
;;   types. 
  
;;   hello-world.core is the name of the namespace. It's common in Clojure
;;   projects to have a core.clj file that contains the main code for the
;;   project, and the namespace name is typically based on the file name.
  
  (:gen-class))
;;   (:gen-class) is a directive to the Clojure compiler to generate a Java
;;   class from this code when it's compiled. This is necessary because the JVM,
;;   which Clojure runs on, needs to start execution from a specific class. The
;;   class generated from this Clojure code will be the entry point for the
;;   application when it's run.

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; This is the definition of a function named -main.

;; defn is a macro used to define a new function.

;; -main is the name of the function. The dash "-" at the beginning of the
;; function name is a convention that's used when :gen-class is used in the
;; namespace declaration. This tells the Clojure compiler to generate a Java
;; method named main in the class it generates. The main method is the entry
;; point that the JVM calls when starting an application.

;; [& args] is the argument list for the function. The ampersand "&" is used to
;; capture any number of arguments into a sequence. So args will be a sequence
;; that contains all the arguments passed to the function. In this case, args is
;; not used in the function, but it needs to be there because the main method in
;; Java always receives an array of strings as its argument.

;; (println "Hello, World!") is the body of the function. println is a function
;; that prints the string "Hello, World!" to the console and then prints a
;; newline. This is all that the -main function does when it's called.
