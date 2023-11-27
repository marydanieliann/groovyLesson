package Strings


def strippedFirstNewline = '''\
line one
line two
line three
'''

def startingAndEndingWithANewline = '''
line one
line two
line three
'''

def escapeSlash = /The character \/ is a forward slash/


def multilineSlashy = /one
    two
    three/
println(multilineSlashy)
println(multilineSlashy.contains('\n'))

println(escapeSlash)

print(strippedFirstNewline)

println(startingAndEndingWithANewline)

println(!strippedFirstNewline.startsWith('\n'))

//def name = 'Zachary'
//def x  = 3
//def y = 7
//def groovyStr = "Hello ${name}, $x * $y equals ${x*y}"
//assert groovyStr == 'Hello Zachary, 3 * 7 equals 21'

