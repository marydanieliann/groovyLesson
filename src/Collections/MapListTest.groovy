package Collections

def inputStr = " me"
def output = inputStr.replaceAll(" ", "").replaceAll(",", "").toCharArray()
def alphabet = [] as Set
('a'..'z').each { it ->
    alphabet << it
}
println alphabet
def text = [] as Set
def text2 = "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
text2 = text2.toLowerCase()

text2.each { it ->
    if (!(it in [' ', ',', '.', "'"]) && !(it.isNumber()))
        text << it
}
alphabet.each { it ->
    if (!(text.contains(it)))
        text << it
}
println(text)
def textMap = [:]
textMap as HashMap
text.eachWithIndex { it, idx ->
    textMap.put(alphabet[idx], it)
}
println textMap

def conditionMet = false
output.eachWithIndex { it, idx ->
    conditionMet = false
    if (idx < output.size() && !conditionMet) {
        textMap.each { k, v ->
            if (output[idx] == k && !conditionMet) {
                output[idx] = v
                conditionMet = true
            }
        }
    }
}

println output
