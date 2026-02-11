class Tv {
    public void show() {
        System.out.println("This is the parent class");
    }

    public void start() {
        System.out.println("Tv is starting");
    }

}

class smartTV extends Tv {
    @Override
    public void show() {
        System.out.println("This is the child class");
    }

    @Override
    public void start() {
        System.out.println("Smart Tv is starting");
    }

    void connectToInternet() {
        System.out.println("Connecting to the internet");
    }

}

public class Over_Ridding1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        smartTV sm = new smartTV();
        Tv sc = new smartTV();
        // smartTV s = new TV(); that i not valid because parent class reference cannot
        // hold child class object
        t.show();
        t.start();
        sm.show();
        sm.start();
        sm.connectToInternet();
        sc.show();
        sc.start();

    }
}
