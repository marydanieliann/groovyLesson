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


def "abstract"() {
    true
}

this.abstract()

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



class Employee {
    String fName, lName
    int age

    def propertyMissing(String propertyName, propertyValue) {
        println "cannot set $propertyValue - property '$propertyName' is not available"
    }

}
Employee emp = new Employee(fName: "norman", lName: "lewis")
println emp.address
