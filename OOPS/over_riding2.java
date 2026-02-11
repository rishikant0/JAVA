class car {
    public void start() {
        System.out.println("Car is starting");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public void changeGear() {
        System.out.println("Car is changing gear");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

class sportcar extends car {
    @Override
    public void start() {
        System.out.println("Sport Car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Sport Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Sport Car is braking");
    }

    @Override
    public void changeGear() {
        System.out.println("Sport Car is changing gear");
    }

    @Override
    public void stop() {
        System.out.println("Sport Car is stopping");
    }

    public void turboBoost() {
        System.out.println("Sport Car is using turbo boost");
    }
}

public class over_riding2 {
    public static void main(String[] args) {
        car c = new car();
        sportcar sc = new sportcar();
        car cs = new sportcar();
        c.start();
        c.accelerate();
        c.brake();
        c.changeGear();
        c.stop();

        sc.start();
        sc.accelerate();
        sc.brake();
        sc.changeGear();
        sc.stop();
        sc.turboBoost();

        cs.start();
        cs.accelerate();
        cs.brake();
        cs.changeGear();
        cs.stop();
    }
}
