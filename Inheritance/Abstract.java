public class Abstract{
    public static void main(String[] args) {
        Horse h = new  Horse();

    }
}

abstract  class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor caled");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract  void walk();
}

class Horse extends  Animal{

     Horse() {
        System.out.println("Horse constructor called");
    }
    
    void Changecolor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Walk on 4 legs");
    }
}