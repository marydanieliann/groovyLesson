package Closure

def isOdd = { int i -> i % 2 != 0 }
println isOdd(3)
println isOdd.call(2)

def isEven = { it % 2 == 0 }
println isEven(3)
println isEven.call(2)


def closureWithTwoArgs = { -> 15 }
println(closureWithTwoArgs())


def concat1 = { String... args -> args.join('') }
println concat1('abc', 'def')
def concat2 = { String[] args -> args.join('') }
println concat2('abc', 'def')


def name = 'Dave'
def c = {println "$name called this closure ${it+1} time${it > 0 ? 's' : ''}"}
assert c instanceof Closure
5.times(c)

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



he1.with {it ->
    name = name ?: 'NameOfElement'
    atomicNumber =  atomicNumber ?: 4
    println(it)
}

def names = ['Alice', 'Bob', 'Charlie']
names.findAll { name1 ->
    if (name1 == 'Bob') {
        println("YES")
    }
    println"Hello, $name1!"
}
def numbers = [4,6,7,10]
def evenNumbers = numbers.sort { number -> number % 2 == 0 }
println evenNumbers

def volume = { double l, double w, double h -> l * w * h }
def fixedWidthVolume = volume.ncurry(1, 2d)
println volume(3d, 2d, 4d)
//println fixedWidthVolume(3d, 4d)
def fixedWidthAndHeight = volume.ncurry(1, 2d, 4d)
//println volume(3d, 2d, 4d)
println fixedWidthAndHeight(3d)

//index based curry with an error
/*
def mul = {a,b,c -> a*b*c}
def currFunc = mul.ncurry([0,2])
def res = currFunc(2,3)
println res*/

//memoization
//without memoization
def fibonacci
fibonacci = { long n -> n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2) }
println fibonacci(25)

//with memoization
def fib
fib = { long n -> n < 2 ? n : fib(n - 1) + fib(n - 2) }.memoize()
println fib(25)

//find out what is the problem with this memoize function
/*def factorial = { long n ->
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
} .memoize()

println factorial(15)*/

def plus2 = { it + 2 }
def times3 = { it * 3 }

def times3plus2 = plus2 << times3
//3*3+2
println times3plus2(3)
//3*4+2
println times3plus2(4)
//3*4+2
println plus2(times3(4))

def plus2times3 = times3 << plus2
//(3+2)*3
println plus2times3(3)
//(5+2)*3
println plus2times3(5)
//(5+2)*3
println times3(plus2(5))

println times3plus2(3)
println ((times3 >> plus2)(3))

class EnclosedInInnerClass {
    class Inner {
        Closure cl = {     }
    }
    void run2() {
        def inner = new Inner()
        println inner.cl()
    }
}


def number4 = [ 5, 7, 9, 12 ] // 0, 1, 2,3
numbers.eachWithIndex {
    idx, it -> println "$it: $idx"
}

def odd = {
    switch (it) {
        case { it % 2 == 1 }: return true; break
        default: return false
    }
}
println odd(15)
println odd(24)