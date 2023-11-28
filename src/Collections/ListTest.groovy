package Collections

def "whenListContainsElement"() {
    given:
    def list = ['a', 'b', 'c']

    expect:
    list.indexOf('a') > -1
    list.contains('a')
}

print "whenListContainsElement"()

def "whenSetContainsElement_thenCheckReturnsTrue"() {
    given:
    def set = ['a', 'b', 'c'] as Set

    expect:
    set.contains('a')
    'a' in set
}

print "whenSetContainsElement_thenCheckReturnsTrue"()

