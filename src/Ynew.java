////
public class Ynew {
    public class Xnew {
    }

    public Xnew foo() {
        return new Xnew();
    }

    public static Xnew createX(Ynew y) {
        return y.new Xnew();
    }

    public static void main(String[] args) {
        Ynew y = new Ynew();
        y.new Xnew();
        System.out.println("Y1" + " " + y);
        System.out.println("Y2" + " " + createX(y));
    }
}
//public class Ynew {
//    public static class Main {
//        float f1 = 1.0f;
//        Float f2 = 2.0f;
//        float add(Float a1, float a2) {
//            return a1 + a2;
//        }
//        Float calc() {
//            return add(f1, f2);
//        }
//    }
//    public static void main(String[] args) {
//
//
////
////        Float calcResult = new Main().calc();
////        System.out.println(calcResult); // => 3.0
//    }
//}

