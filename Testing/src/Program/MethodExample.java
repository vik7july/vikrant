package Program;

public final class MethodExample {

      void print() {

        System.out.println("Print method without parameters.");

    }

    public void print1() {

        System.out.println("Print method with parameter");

    }

    public static void main(String args[]) {

        MethodExample obj1 = new MethodExample();

        obj1.print();

       // obj1.print("xx");

    }
}
