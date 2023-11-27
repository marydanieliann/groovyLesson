package Closure

class Author {
    def booksPublished

    static prolific(authors) {
        def threshold = 5
        return authors.findAll { it.booksPublished > threshold }
    }
}

def authors = [7, 2, 9].collect { new Author(booksPublished: it) }
println authors
println Author.prolific(authors)