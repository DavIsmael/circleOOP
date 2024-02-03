public class main {
    public static void main(String[] args){
        Circle circle = new Circle(7, 1, 3, 4,12.7, 20);
        double diameter = circle.getDiameter();
        double radius = circle.getRadius2();
        double diameter2 = circle.getDiameterBasedOnRadius(circle.getRadius());
        System.out.println("Diameter: " + diameter);
        System.out.println("Radius: " + radius);
        System.out.println("Diameter 2: " + diameter2);
        circle.draw();
        circle.displayLocation();
    }
}
