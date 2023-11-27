package Closure


class ClosureScope {
    private classVar = "class var"

    private privateMethod() {
        "private method"
    }

    public publicMethod(String arg) {
        def localVar = "local var"
        return {
            "${classVar}, ${privateMethod()}, ${arg}, ${localVar}"
        }
    }
}

def closureScope = new ClosureScope()
def closure = closureScope.publicMethod("method arg")
println closure()