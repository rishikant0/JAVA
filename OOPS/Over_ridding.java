
class InnerOver_ridding {
    public void show() {
        System.out.println("This is the parent class");
    }

}

class child extends InnerOver_ridding {
    @Override
    public void show() {
        System.out.println("This is the child class");
    }

}

public class Over_ridding {

    public static void main(String[] args) {
        child c = new child();
        InnerOver_ridding i = new InnerOver_ridding();
        InnerOver_ridding sc = new child();
        sc.show();
        i.show();
        c.show();

    }
}
