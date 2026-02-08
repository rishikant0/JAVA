import java.awt.Rectangle;

class Innercreate_class {
    public long radius;
    public long height;

    // Surface area calculation
    public double totalSurf() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Volume calculation
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class create_class {
    public static void main(String[] args) {
        Innercreate_class r = new Innercreate_class();
        r.radius = 12;
        r.height = 13;

        System.out.println("Surface Area: " + r.totalSurf());
        System.out.println("Volume: " + r.volume());
    }
}