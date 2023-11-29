package Metaprogramming

class Employee {
    String fName, lName
    int age

    //get call
    def propertyMissing(String propertyName) {
        "property '$propertyName' is not available"
    }
    //set call
    def propertyMissing(String propertyName, propertyValue) {
        println "cannot set $propertyValue - property '$propertyName' is not available"
    }

    def methodMissing(String methodName, def methodArgs) {
        "method '$methodName' is not defined"
    }

    /* try{
         emp.getFullName()
     } catch(MissingMethodException e) {
         println "method is not defined"
     }*/
}

Employee emp = new Employee(fName: "norman", lName: "lewis")
emp.address = 5
println emp.address
emp.getFullName()
