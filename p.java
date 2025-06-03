public class p {
    public static void main(String[] args) {
        A aa = new B();
        ((B)aa).sub();
    }
}

class A{
    void sum(){
        System.out.println("Sum A");
    }


}

class B extends A {
    @Override
    void sum(){
        System.out.println("Sum B");
    }

    void sub() {
        System.out.println("Sub B");
    }
}

