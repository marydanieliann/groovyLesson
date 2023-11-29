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
    def getField1() {
        return 'getHa'
    }
    def getProperty(String name) {
        if (name != 'field3')
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
println second.metaClass.getAttribute(second, 'field2')
println second.metaClass.getAttribute(second, 'field4')

class POGO {
    String property
    /*  void setProperty(String name, Object value) {
          this.@"$name" = 'overridden'
      }*/
}
def pogo = new POGO()
pogo.property = 'alalal'
println pogo.property
println pogo.metaClass
//we are trying to replace the metaclass of 'pogo'
// with a new metaclass created from a different instance of "POGO"
println (pogo.metaClass = new POGO() as MetaClass)

class third {
    def field1 = 'ha'
    def field2 = 'ho'
    def getField1() {
        return 'getHa'
    }
}
def three = new third()
println(three.metaClass.getAttribute(three, 'field1'))
println(three.metaClass.getAttribute(three, 'field2'))

class fourth {
    private String field

    String property1

    void setProperty(String property1) {
        this.property1 = "setProperty1"
    }
}
def four = new fourth()
four.metaClass.setAttribute(four, 'field', 'ha')
four.metaClass.setAttribute(four, 'property1', 'ho')
println four.field
println four.property1

class example {
    def methodMissing(String name, args) {
        return "Missing static method name is $name"
    }
    def propertyMissing(String name) {
        return "Missing static property name is $name"
    }
}
def e = new example()
println e.hello
println e.hello()
//def str1 = example.hi
//def str2 = example.hi()
//println str1
println(str2)
//
//
//
//
//
//class Book {
//    String title
//}
//
//Book.metaClass.titleInUpperCase << {-> title.toUpperCase() }
//
//def b = new Book(title:"The Stand")
//
//println(b.titleInUpperCase())


//class MathOperations {
//    static int add(int a, int b) {
//        return a + b
//    }
//    static int multiply(int a, int b) {
//        return a * b
//    }
//}
//def resultAdd = MathOperations.add(4, 4)
//def resultMultiply = MathOperations.multiply(2, 5)
//
//println "Result of addition: $resultAdd"
//println "Result of multiplication: $resultMultiply"
