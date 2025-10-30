public class Hierarchial{
    public static void main(String[] args) {
        fish f = new fish();
        f.swim();
        Mummle m = new Mummle();
        m.walk();
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
class  fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }

}

class  Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}