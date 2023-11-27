package Closure


def num = [ 5, 7, 9, 12, 3, 8, 9, 2, 2 ]
def numbersCont = { it -> num?.contains(it)}
println numbersCont(7)
num.findAll {it }

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
def dividedThree = list.findAll { it -> it % 3 == 0 ? divBY3 << it : 0 }
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
def repeatedNumbersClosure = { it ->
    def repeatedNumbers = []
    def counts = [:]

    it.each { num4 ->
        counts[num4] = counts.get(num4, 0) + 1
        if (counts[num4] == 2) {
            repeatedNumbers << num4
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


def maxClosure = { it -> it.max() }
def max = maxClosure(numbersList)
println "Max Value: $max"

def minClosure = { it -> it.min() }
def min = minClosure(numbersList)
println "Min Value: $min"

