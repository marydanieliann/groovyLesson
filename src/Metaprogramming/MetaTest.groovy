package Metaprogramming

class SomeGroovyClass {
    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }
    def test() {
        return 'method exists'
    }
}
def someGroovyClass = new SomeGroovyClass()
println someGroovyClass.test()
println someGroovyClass.someMethod()


class second {
    def property1 = 'ha'
    def field2 = 'ho'
    def field4 = 'hu'
    def getField1(){
        return 'getHa'
    }
    def getProperty(String name) {
        if(name != 'field3')
            return metaClass.getProperty(this, name)
        else
            return 'field3'
    }

}
def second = new second()
println second.field1
println second.field2
println second.field3
println second.field4

class POGO {
    String property
    void setProperty(String name, Object value){
        this.@"$name" = 'overridden'
    }
}
def pogo = new POGO()
pogo.property = 'alalal'
println pogo.property