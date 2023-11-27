package Closure


//delegates in GStrings
def x = 1
def gs = "x = ${x}"
println gs
x = 5
println gs

def x1 = 1
def gs1 = "x = ${-> x1}"
println gs1
x1 = 5
println gs1
