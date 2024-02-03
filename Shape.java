public abstract class Shape {
    double radius;
    double diameter;
    double diameter2;
    double radius2;
    double x;
    double y;
    double x2;
    double y2;
    Shape(double x, double y, double x2, double y2){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void displayLocation(){
        System.out.println("x1: " + this.x + ", x2: " + this.x2 + ", y1: " + this.y + ", y2: " + this.y2 + " coordinates of " + this + " circle?");
    }
    public abstract void draw();
}