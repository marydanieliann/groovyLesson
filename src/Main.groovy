//static void main(String[] args) {
//    Employee emp = new Employee(fName: "norman", lName: "lewis")
//    emp.address = 5
//    println emp.address
//    emp.getFullName()
//}
//
//class Employee {
//    String fName, lName
//    int age
//
//    //get call
//    def propertyMissing(String propertyName) {
//        "property '$propertyName' is not available"
//    }
//    //set call
//    def propertyMissing(String propertyName, propertyValue) {
//        println "cannot set $propertyValue - property '$propertyName' is not available"
//    }
//
//    def methodMissing(String methodName, def methodArgs) {
//        "method '$methodName' is not defined"
//    }
////    try{
////        emp.getFullName()
////    } catch(MissingMethodException e) {
////        println "method is not defined"
////    }
//}
//


//def "abstract"() {
//    true
//}
//
//this.abstract()

//class Person {
//    String name
//
//    void setName(String val) {
//        name = val.toUpperCase().reverse()
//    }
//}
//Person p = new Person(name:'Hannah')
//assert p.name == 'HANNAH'
////def person = new Person(name:'name')
//////person.name='NewName'
//////person.setName('name')
//////assert person.name == 'name'
////assert person.name == 'NAME'


//def name = 'Zachary'
//def x  = 3
//def y = 7
//def groovyStr = "Hello ${name}, $x * $y equals ${x*y}"
//assert groovyStr == 'Hello Zachary, 3 * 7 equals 21'

//def name = 'Dave'
//def c = {println "$name called this closure ${it+1} time${it > 0 ? 's' : ''}"}
//assert c instanceof Closure
//5.times(c)

//def colors = ['red', 'green', 'blue', 'yellow']
//def empty = []
//assert colors instanceof List
//assert empty instanceof List
//assert empty.class.name == 'java.util.ArrayList'
//
//def names = ['nate', 'matthew', 'amanda']
//names.each{
//    println "the name $it contains ${it.size()} characters"
//}
////assert names.min() == 'amanda'
////assert names.max() == 'nate'
//def sorted = names.sort()
////assert sorted == ['amanda', 'matthew', 'nate']
////sorted = names.sort{it.size()}
////assert sorted == ['nate', 'amanda', 'matthew']
//sorted = names.sort{obj1, obj2 -> obj1[2] <=> obj2[2]}
////assert sorted = ['matthew', 'nate', 'amanda']

//names<<'jim'
////assert names.contains('jim')

//def family = [boys:7, girls:6, debbie:1, dave:1]
//def empty = [:]
//
//def favColors = [ben : 'green', solomon:'blue', joanna:'red']
//favColors.each{key, value ->
//    println "${key}'s fave color is ${value}. "
//}
//favColors.hannah = 'yellow'
//favColors.size()
//
//
//def employees = ['susannah', 'noah', 'samuel', 'gideon', 'gideon'] as Set
//employees.size()
//employees << 'joshua'
//employees.size()
//println employees.toList()
////Set empty = []
//
//
//
//class Employee {
//    String fName, lName
//    int age
//
//    def propertyMissing(String propertyName, propertyValue) {
//        println "cannot set $propertyValue - property '$propertyName' is not available"
//    }
//
//}
//Employee emp = new Employee(fName: "norman", lName: "lewis")
//println emp.address
//
//
//public class Y {
//    class X {}
//    X foo() {
//        return new X()
//    }
//    static X createX(Ynew y) {
//        return new X(y)
//    }
//    static void main(String[] args) {
//        def y = new Y();
//        def x = new X(y);
//        x.foo();
//        createX(y);
//        println("Test" + "" + x)
//    }
//}
/*

class Y {
    class X {}
    X foo() {
        new X()
    }
    static X createX(Y y) {
        new X(y)
    }
}

def yInstance = new Y()
def xInstance = yInstance.foo()
println xInstance

def a = 2
def b = a++ * 3

println a == 3 && b == 6
*/

/*
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Person1 {
    String name
    int age
}

def person1 = new Person1(name: 'John', age: 30)
def person2 = new Person1(name: 'John', age: 30)

println person1 == person2

println person1.hashCode() == person2.hashCode()
*/

/*

boolean checkIfCalled() {
    called = true
}

called = false
true || checkIfCalled()
println !called


called = false
false || checkIfCalled()
println called

called = false
false && checkIfCalled()
println !called

called = false
true && checkIfCalled()
println called
*/

//print((!'foo') == false)
//def strippedFirstNewline = '''\
//line one
//line two
//line three
//'''
//
//def startingAndEndingWithANewline = '''
//line one
//line two
//line three
//'''
//
//def escapeSlash = /The character \/ is a forward slash/
//
//
//def multilineSlashy = /one
//    two
//    three/
//println(multilineSlashy)
//println(multilineSlashy.contains('\n'))
//
//println(escapeSlash)
//
//print(strippedFirstNewline)
//
//println(startingAndEndingWithANewline)
//
//println(!strippedFirstNewline.startsWith('\n'))
//
//class F {
//    float f1 = 1.0f
//    Float f2 = 2.0f
//
//    float add(Float a1, float a2) {
//        a1 + a2
//    }
//
//    Float calc() {
//        add(f1, f2)
//    }
//}

//static void main(String[] args) {
//    def f = new F()
//    print(f.calc())
//    assert f.calc() == 3.0
/*  float f1 = 0.0f
    float f2 = -0.0f
    Float f3 = 0.0f
    Float f4 = -0.0f

    println("f1 == f2 " + (f1 == f2))
    assert f1 == f2
    assert (Float) f1 != (Float) f2

    println("f3 != f4 " + (f3 != f4))
    assert f3 != f4
    println("same type " + ((float) f3 == (float) f4))
    assert (float) f3 == (float) f4

    println(!f1.equals(f2))
    println(!f3.equals(f4))
    assert !f1.equals(f2)
    assert !f3.equals(f4)

    println("f1 == f2 " + f1.equalsIgnoreZeroSign(f2))
    println("f3 == f4 " + f3.equalsIgnoreZeroSign(f4))
    assert f1.equalsIgnoreZeroSign(f2)
    assert f3.equalsIgnoreZeroSign(f4)*/
//    double b = 0.8;
//    float c = 4.0f;
//    println((c/b))
// double   println((c/b) instanceof double )
//    BigDecimal a = 1000;
//    BigDecimal d = 125000;
//    println(d.divide(a))
//    println((d/a) instanceof BigDecimal)
//}

//class Example1 {
//    static void main(String[] args) {
//        int a = 2
//        if (a<10) {
//            println("The value is less than 10"); // if a<10 true
//        } else {
//            println("The value is greater than 10"); // if a>10 false
//        }
//    }
//}
//
//class Example3 {
//    static void main(String[] args) {
//        int a = 2
//        println(a<10?:'greater than 10')
//    }
//}

// domain
/*
import groovy.transform.ToString

@ToString(includePackage = false)
class Element {
    String name
    int atomicNumber
}
//controller
def he = new Element(name: 'Helium')
def he1 = new Element(name: 'Hydrogen')
he.with {it ->
    name = name ?: 'NameOfElement'
    atomicNumber =  atomicNumber ?: 2
    println(it)
}
he1.with {it ->
    name = name ?: 'NameOfElement'
    atomicNumber =  atomicNumber ?: 4
    println(it)
}

def names = ['Alice', 'Bob', 'Charlie']
names.findAll { name ->
    if (name == 'Bob') {
        println("YES")
    }
    println"Hello, $name!"
}
def numbers = [4,6,7,10]
def evenNumbers = numbers.sort { number -> number % 2 == 0 }
println evenNumbers
*/

/*
//for closures
def str = 'example of method reference'
def fun = str.&toUpperCase
def fun1 = str.&size
def upper = fun()
def upper1 = fun1()
println(upper)
println(upper1)

*/

/*
import groovy.transform.CompileStatic
import static java.util.stream.Collectors.toList
//method reference examples
@CompileStatic
void methodRefs() {
    println( [1G, 2G, 3G].stream().reduce(0G, BigInteger::add))
    println([1G, 2G, 3G].stream().map(3G::add).collect(toList()))
    println([1L, 2L, 3L].stream().map(BigInteger::valueOf).collect(toList()))
    println([1L, 2L, 3L].stream().map(3G::valueOf).collect(toList()))
}
methodRefs()
*/

/*
import java.util.regex.Pattern
p = ~'foo'
println(p)
p = ~"foo"
println(p)
p = ~$/dollar/slashy $ string/$
println(p)
p = ~"${pattern}"
println(p)
*/

/*
class Car {
    String make
    String model
}
def cars = [
        new Car(make:'Peugeot', model:'508'),
        new Car(make:'Mercedes Benz', model:'w223')
]
def makes = cars.collect{it.make}
def models = cars.collect{it.model}
*/
/*def makes = cars*.make
def models = cars*.model*//*

println makes
println models
*/

class Component {
    Integer id
    String name
}
class CompositeObject implements Iterable<Component> {
    def components = [
            new Component(id: 1, name: 'component1'),
            new Component(id: 2, name: 'component2')]

    @Override
    Iterator<Component> iterator() {
        components.iterator()
    }
}

def comp = new CompositeObject()
println comp*.id
println comp*.name