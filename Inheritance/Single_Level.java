public class Single_Level{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.Breathe();
        shark.Swim();
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

class Fish extends Animal{
      int fins;

    void Swim(){
        System.out.println("Swim");
    }
}