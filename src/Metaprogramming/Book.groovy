package Metaprogramming

class BookTest {
    String title
}

def properties = Collections.synchronizedMap([:])
BookTest.metaClass.setAuthor = { String value ->
    properties[System.identityHashCode(delegate) + "author"] = value
}
BookTest.metaClass.getAuthor = { ->
    properties[System.identityHashCode(delegate) + "author"]
}
def b = new BookTest()
print(b.title = "war and peace")