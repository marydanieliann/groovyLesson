package Metaprogramming

class CoolNewGroovyObject {
    void regularMethod() { println "GroovyObject#regularMethod" }
    def closureProperty = { println "GroovyObject#property" }
    Object methodMissing(String name, Object args) { println "Method missing: ${name}" }
    def regularProperty = "This is a nice String"
}