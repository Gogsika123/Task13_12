public class Main {//test geometric object
    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0.0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(5.0);
        objects[1] = new Circle(3.0);
        objects[2] = new Rectangle(4.0, 6.0);
        objects[3] = new Rectangle(2.0, 8.0);

        double totalArea = sumArea(objects);
        System.out.println("Total area of all objects: " + totalArea);
    }
}