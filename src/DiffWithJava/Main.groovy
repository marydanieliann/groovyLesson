package DiffWithJava

//public class Y {
//    class X {}
//    X foo() {
//        return new X()
//    }
//    static X createX(Ynew y) {
//        return new X(y)
//    }
//    static void main(String[] args) {
//        def y = new Y();
//        def x = new X(y);
//        x.foo();
//        createX(y);
//        println("Test" + "" + x)
//    }
//}

    class Y1 {
        class X {}

        X foo() {
            new X()
        }

        static X createX(Y1 y) {
            new X(y)
        }

    }
    def yInstance = new Y1()
    def xInstance = yInstance.foo()
    println xInstance



