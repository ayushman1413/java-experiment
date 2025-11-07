package q11267;

public class Box {
    private double length;
    private double width;
    private double height;

    // Constructor for 3 sides
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Constructor for cube
    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // Default constructor for invalid/no input
    public Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    public double getVolume() {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Box box;

        if (args.length == 3) {
            double l = Double.parseDouble(args[0]);
            double w = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);
            box = new Box(l, w, h);
            System.out.printf("Volume of Box(%.1f, %.1f, %.1f) is : %.2f%n", l, w, h, box.getVolume());
        } else if (args.length == 1) {
            double side = Double.parseDouble(args[0]);
            box = new Box(side);
            System.out.printf("Volume of Box(%.1f) is : %.2f%n", side, box.getVolume());
        } else {
            box = new Box();
            System.out.printf("Volume of Box() is : %.2f%n", box.getVolume());
        }
    }
}

