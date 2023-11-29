package Metaprogramming

class MetaExpando {

    private dynamicProps = [:]

    void setProperty(String propName, val) {
        dynamicProps[propName] = val
    }

    def getProperty(String propName) {
        dynamicProps[propName]
    }

    def methodMissing(String methodName, args) {  // 1
        def prop = dynamicProps[methodName]         // 2
        if (prop instanceof Closure) {               // 3
            return prop(*args)                        // 4
        }
    }
}

def meta = new MetaExpando()
println meta.hello("hello")
/*
def str1 = MetaExpando.hello()
println str1*/
