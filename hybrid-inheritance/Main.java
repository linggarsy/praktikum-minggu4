interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements A {
    public void methodA() {
        System.out.println("Method A dari C");
    }
}

class D implements B {
    public void methodA() {
        System.out.println("Method A dari D");
    }
    public void methodB() {
        System.out.println("Method B dari D");
    }
}

class E extends D {
    void methodE() {
        System.out.println("Method E dari E");
    }
}

public class Main {
    public static void main(String[] args) {
        E obj = new E();
        obj.methodA();
        obj.methodB();
        obj.methodE();
    }
}
