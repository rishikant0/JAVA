class A{
     public void show(){
        System.out.println("Super class method");
    }

    public void display(){
        System.out.println("display Super class method");
    }
   
}

class B extends A{
    @Override
    public void display(){
        System.out.println("display Sub class method");
    }
    public void output(){
        System.out.println("Output Sub class method");
    }
}

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        A s = new B();
        s.show();
        s.display(); // Calls the overridden method from class B
        // s.output(); ---> This will cause a compile-time error because the reference type A does not have the method output()

        B b= new B();
        b.show();
        b.display();
        b.output();
    }
}
