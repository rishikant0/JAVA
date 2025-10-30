public class Multi_Level{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.leg = 4;
        System.out.println(d.leg);

    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("Eat");
    }
    void Breathe(){
        System.out.println("Breathes");
    }
    
}
class Mummle extends Animal{
      int leg;

}
class  Dog extends Mummle{
    String Bread;

}