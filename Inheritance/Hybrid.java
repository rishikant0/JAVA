public class Hybrid{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.leg =4;
        d.swim();
        System.out.println(d.leg);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eat");
    }
   
    
}
class Mummle extends Animal{
    void walk(){
        System.out.println("walk");
    }

}
class  Dog extends Mummle{
    int leg;
    void swim(){
        System.out.println("Barks");
    }

}


