package Metaprogramming

class Runner {
    static void main(String[] args) {
        GroovyObject.metaClass.metaMethod = { println 'From metaclass' }
        GroovyObject go = new CoolNewGroovyObject()
        go.metaMethod()
        go.regularMethod()
        go.closureProperty()
        go.regularProperty()
    }
}
