package Closure

//mutation example
class Employee {
    String name

    String toString() { name }

}

def sam = new Employee(name: 'Sam')
def lucy = new Employee(name: 'Lucy')
def person = sam
def empCl = "Name : ${person}"
println empCl
person = lucy
println empCl
sam.name = 'Lucy'
println empCl

//the same example without mutation
def empCl2 = "Name : ${-> person}"
println empCl2
person = lucy
println empCl2


class Employee2 {
    String name
    int hourlyRate
    int WeeklyHours
    int numOfSalesYear
}
def employeeTotal={salaryCalc, bonusCalc, employee -> salaryCalc(employee) + bonusCalc(employee)}
def salaryCalc = {employee -> employee.hourlyRate * employee.WeeklyHours  * 52}
def bonusCalc = {employee -> employee.numOfSalesYear * 100}
def employee = new Employee2(name:"John", hourlyRate: 50, WeeklyHours: 40, numOfSalesYear: 50)
def calcEmpTotal= employeeTotal.curry(salaryCalc,bonusCalc)
println calcEmpTotal(employee)
