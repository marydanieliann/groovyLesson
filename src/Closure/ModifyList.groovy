package Closure

class Modify extends ArrayList {
    Modify(def collection) {
        super(collection)
    }
    void modify(closure) {
        for (i in 0..<this.size()) {
            this[i] = closure(this[i])
        }
    }
}
def list = new Modify([1,2,3])
list.modify({it * it})
println list


list = list.collect{it -> it * it + 9}
println list
list = list.collect{it -> Math.sqrt(it)}
println list

key ={value -> println value}
def m = [(key) : 5]
println(m[key])
println(m.get(key))
println m.key




