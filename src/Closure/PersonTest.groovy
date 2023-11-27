package Closure


//example of CLosure.Owner_First
class Person1 {
    String name
    def pretty = { "My name is $name" }

    String toString() {
        pretty()
    }
}

class Thing {
    String name
}

def p = new Person1(name: 'Sarah')
def t = new Thing(name: 'Teapot')

println p.toString()

p.pretty.delegate = t
println p.toString()

//example of Owner_first, Delegate_ONLY
class Person2 {
    String name
    int age
    def fetchAge = { age }
}

class Thing2 {
    String name
}

def p2 = new Person2(name: 'Jessica', age: 42)
def t2 = new Thing2(name: 'Printer')
def cl = p2.fetchAge
cl.delegate = p2
println cl()
cl.delegate = t2
println cl()

cl.resolveStrategy = Closure.DELEGATE_ONLY
cl.delegate = p2
println cl()
cl.delegate = t2
try {
    cl()
    assert false
} catch (MissingPropertyException ex) {
    println("age is not defined on the delegate")
}

//the same example of those two strategies including metaprogramming
class Person3 {
    String name
    int age
    def fetchAge2 = { age }
}

class Thing3 {
    String name

    def propertyMissing(String name) { -1 }
}

def p3 = new Person3(name: 'Jessica', age: 42)
def t3 = new Thing3(name: 'Printer')
def cl2 = p3.fetchAge2
cl2.resolveStrategy = Closure.DELEGATE_FIRST
cl2.delegate = p3
println cl2()
cl2.delegate = t3
println cl2()
