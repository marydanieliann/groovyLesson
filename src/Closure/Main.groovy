package Closure

/*
 def isOdd = { int i -> i%2 != 0 }
 println isOdd(3)
 println isOdd.call(2)

 def isEven = { it%2 == 0 }
 println isEven(3)
 println isEven.call(2)


 def closureWithTwoArgs = { -> 15 }
 println(closureWithTwoArgs()  )


 def concat1 = { String... args -> args.join('') }
 println concat1('abc','def')
 def concat2 = { String[] args -> args.join('') }
 println concat2('abc', 'def')

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
*/


//def name = 'Dave'
//def c = {println "$name called this closure ${it+1} time${it > 0 ? 's' : ''}"}
//assert c instanceof Closure
//5.times(c)
/*
import groovy.transform.ToString

@ToString(includePackage = false)
class Element {
    String name
    int atomicNumber
}
//controller

def he = new Element(name: 'Helium')
//def he1 = new Element(name: 'Hydrogen')
he.with { it ->
    name = name ?: 'NameOfElement'
    atomicNumber = atomicNumber ?: 2
    println(it)
}
*/


//he1.with {it ->
//    name = name ?: 'NameOfElement'
//    atomicNumber =  atomicNumber ?: 4
//    println(it)
//}

//def names = ['Alice', 'Bob', 'Charlie']
//names.findAll { name ->
//    if (name == 'Bob') {
//        println("YES")
//    }
//    println"Hello, $name!"
//}
//def numbers = [4,6,7,10]
//def evenNumbers = numbers.sort { number -> number % 2 == 0 }
//println evenNumbers
//
////example of CLosure.Owner_First
//class Person1 {
//    String name
//    def pretty = { "My name is $name" }
//
//    String toString() {
//        pretty()
//    }
//}
//
//class Thing {
//    String name
//}
//
//def p = new Person1(name: 'Sarah')
//def t = new Thing(name: 'Teapot')
//
//println p.toString()
//
//p.pretty.delegate = t
//println p.toString()
//
////example of Owner_first, Delegate_ONLY
//class Person2 {
//    String name
//    int age
//    def fetchAge = { age }
//}
//
//class Thing2 {
//    String name
//}
//
//def p2 = new Person2(name: 'Jessica', age: 42)
//def t2 = new Thing2(name: 'Printer')
//def cl = p2.fetchAge
//cl.delegate = p2
//println cl()
//cl.delegate = t2
//println cl()
//
//cl.resolveStrategy = Closure.DELEGATE_ONLY
//cl.delegate = p2
//println cl()
//cl.delegate = t2
//try {
//    cl()
//    assert false
//} catch (MissingPropertyException ex) {
//    println("age is not defined on the delegate")
//}
//
////the same example of those two strategies including metaprogramming
//class Person3 {
//    String name
//    int age
//    def fetchAge2 = { age }
//}
//
//class Thing3 {
//    String name
//
//    def propertyMissing(String name) { -1 }
//}
//
//def p3 = new Person3(name: 'Jessica', age: 42)
//def t3 = new Thing3(name: 'Printer')
//def cl2 = p3.fetchAge2
//cl2.resolveStrategy = Closure.DELEGATE_FIRST
//cl2.delegate = p3
//println cl2()
//cl2.delegate = t3
//println cl2()
//
////delegates in GStrings
//def x = 1
//def gs = "x = ${x}"
//println gs
//x = 5
//println gs
//
//def x1 = 1
//def gs1 = "x = ${-> x1}"
//println gs1
//x1 = 5
//println gs1
//
////mutation example
//class Employee {
//    String name
//
//    String toString() { name }
//
//}
//
//def sam = new Employee(name: 'Sam')
//def lucy = new Employee(name: 'Lucy')
//def person = sam
//def empCl = "Name : ${person}"
//println empCl
//person = lucy
//println empCl
//sam.name = 'Lucy'
//println empCl
//
////the same example without mutation
//def empCl2 = "Name : ${-> person}"
//println empCl2
//person = lucy
//println empCl2
//
//
//def volume = { double l, double w, double h -> l * w * h }
//def fixedWidthVolume = volume.ncurry(1, 2d)
//println volume(3d, 2d, 4d)
////println fixedWidthVolume(3d, 4d)
//def fixedWidthAndHeight = volume.ncurry(1, 2d, 4d)
////println volume(3d, 2d, 4d)
//println fixedWidthAndHeight(3d)
//
////index based curry with an error
///*
//def mul = {a,b,c -> a*b*c}
//def currFunc = mul.ncurry([0,2])
//def res = currFunc(2,3)
//println res*/
//
////memoization
////without memoization
//def fibonacci
//fibonacci = { long n -> n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2) }
//println fibonacci(25)
//
////with memoization
//def fib
//fib = { long n -> n < 2 ? n : fib(n - 1) + fib(n - 2) }.memoize()
//println fib(25)
//
////find out what is the problem with this memoize function
///*def factorial = { long n ->
//    if (n == 0 || n == 1) {
//        return 1
//    } else {
//        return n * factorial(n - 1)
//    }
//} .memoize()
//
//println factorial(15)*/
//
//def plus2 = { it + 2 }
//def times3 = { it * 3 }
//
//def times3plus2 = plus2 << times3
////3*3+2
//println times3plus2(3)
////3*4+2
//println times3plus2(4)
////3*4+2
//println plus2(times3(4))
//
//def plus2times3 = times3 << plus2
////(3+2)*3
//println plus2times3(3)
////(5+2)*3
//println plus2times3(5)
////(5+2)*3
//println times3(plus2(5))
//
//println times3plus2(3)
//println ((times3 >> plus2)(3))
//
//class EnclosedInInnerClass {
//    class Inner {
//        Closure cl = {     }
//    }
//    void run2() {
//        def inner = new Inner()
//        println inner.cl()
//    }
//}


/*def numbers = [ 5, 7, 9, 12 ] // 0, 1, 2,3
numbers.eachWithIndex {
    idx, it -> println "$it: $idx"
}*/

//def num = [ 5, 7, 9, 12, 3, 8, 9, 2, 2 ]
//def numbersCont = { it -> num?.contains(it)}
//println numbersCont(7)
//num.findAll {it }

def numbersList = [5, 5, 5, 9, 6, 3, 1, 4, 7, 8, 9, 6, 5, 3, 2, 5, 7, 94, 4, 12, 3, 8, 9, 2, 2, 15, 26, 27, 5, 3]
def count = 0
def divBY3 = new ArrayList<>()
def lessThan10 = new ArrayList<>()
def findMax = numbersList.max { a, b -> (a <=> b) }
def findMin = numbersList.min { a, b -> (a <=> b) }
def median = (findMax + findMin) / 2
def duplicated = new ArrayList<>()
numbersList.sort { a, b -> a <=> b }
println "sorted " + numbersList
def list = numbersList as Set
println("unique " + (list as List))
def dividedThree = list.findAll { it -> it % 3 == 0 ? divBY3<<it : 0 }
list.findAll { it -> it > 10 ? 0 : lessThan10 << it }

/*//hard work without optimization
for (int i = 0; i < numbersList.size(); i++) {
    def index = i;
    if (index == numbersList.size() - 1) {
        break
    }
    if (numbersList.get(index) == numbersList.get(index + 1)) {
        count++
    }
    if (count >= 1) {
        if (!duplicated.contains(numbersList.get(index)))
            duplicated.add(numbersList.get(index))
        count = 0
    }

}
//hard work with chat gpt with optimization
numbersList.eachWithIndex { number, index ->
    if (index < numbersList.size() - 1 && number == numbersList[index + 1]) {
        count++
    } else {
        if (count >= 1 && !duplicated.contains(number)) {
            duplicated << number
        }
        count = 0
    }
}*/
/*
def repeatedNumbersClosure = { it ->
    def repeatedNumbers = []
    def counts = [:]

    it.each { num ->
        counts[num] = counts.get(num, 0) + 1
        if (counts[num] == 2) {
            repeatedNumbers << num
        }
    }
    repeatedNumbers
}

def repeatedNumbers = repeatedNumbersClosure(numbersList)

println "Repeated Numbers: $repeatedNumbers"
println "Numbers that are divided by 3 " + divBY3
println "Numbers that are less than 10 " + lessThan10
println "\nDuplicated values retrieved from list " + duplicated
println("Max number: " + findMax)
println("Min number: " + findMin)
println("Median of max and min numbers: " + median)
println("All numbers that are divided by 3 " + dividedThree)

*/

/*
def maxClosure = { it -> it.max() }
def max = maxClosure(numbersList)
println "Max Value: $max"

def minClosure = { it -> it.min() }
def min = minClosure(numbersList)
println "Min Value: $min"
*/
