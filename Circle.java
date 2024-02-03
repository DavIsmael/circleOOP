public class Circle extends Shape{
    Circle(double x, double y, double x2, double y2, double radius, double diameter){
        super(x, y, x2, y2);
        this.radius = radius;
        this.diameter = diameter;
    }
    public double getDiameter(){
        this.diameter = Math.sqrt(Math.pow(this.x2 - this.x, 2) + Math.pow(this.y2 - this.y, 2));
        return this.diameter;
    }
    public double getRadius2(){
        this.radius2 = this.diameter / 2;
        return this.radius2;
    }
    public double getDiameterBasedOnRadius(double radius2){
        this.diameter2 = radius2 * 2;
        return this.diameter2;
    }
    public double getRadius(){
        return this.radius;
    }
    public void draw(){
        System.out.println("Drawing a circle with radius: " + this.radius + " cm");
    }
}