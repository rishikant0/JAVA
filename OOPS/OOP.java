public class OOP{
   public static void main(String[] args) {
       Pen p1 = new Pen();
       p1.setcolor("Blue");
       System.err.println(p1.color);
       p1.settip(5);
       System.err.println(p1.tip);
   }
}

class Pen{
    String color;
    int tip;
     
    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip =newtip;
    }
}