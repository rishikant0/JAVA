public class FunctionOverriding{
    public static void main(String[] args) {
       deer d = new deer();
       d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat Anything");
    } 
}

class deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}