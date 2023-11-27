package Closure

class Enclosing2 {
    void run1() {
        def whatIsThisObject = { getThisObject() }
        println whatIsThisObject() //== this
        def whatIsThis = { this }
        println whatIsThis() //== this
    }
}

def e = new Enclosing2()
e.run1()


def closure = { println "Delegate: $delegate" }

def someObject = [name: "John"]
closure.delegate = someObject

closure()

def outerClosure1 = {
    def innerClosure1 = { println "Owner: $owner" }
    innerClosure1()
}

outerClosure1()

def closure1 = {
    println "Name: $name"
}

def someObject1 = [name: "Bob"]
closure.delegate = someObject1

closure1()


EnclosedInInnerClass e3 = new EnclosedInInnerClass()
e.run2()


class Enclosing3 {
    void run3() {
        def whatIsOwnerMethod = {
            getOwner()
        }
        //println getOwner() }
        println whatIsOwnerMethod() //== this
        def whatIsOwner = { owner }
        println whatIsOwner()// == this
    }
}


class Example {
    def outerField = "Outer Field"

    def outerMethod() {
        def outerClosure2 = {
            def innerClosure2 = {
                println "Inner Closure - Owner: $owner, This: $this"
            }
            innerClosure2()
        }

        outerClosure2.delegate = this
        outerClosure2()
    }
}

def instance = new Example()
instance.outerMethod()


def e2 = new Enclosing3()
e.run3()
