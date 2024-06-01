package Day13SuperClasses;

class A {
    public A(int x){ }

 //   public A (){}
}

class B extends A {
    public B() {
    super(1);
    }

}

class C {
    public static void main(String[] args) {
        B b = new B();
    }
}