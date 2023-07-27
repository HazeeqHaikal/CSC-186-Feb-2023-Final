class Rectangle{
    private double length;
    private double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public Rectangle (Rectangle r){
        length = r.length;
        width = r.width;
    }

    public double areaRectangle(){
        return length * width;
    }
}

public class MainClass{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(10.2, 5.4);
        Rectangle r2 = new Rectangle(r1);
        System.out.print(r1.areaRectangle());
        System.out.print(r2.areaRectangle());
        // output: 55.0855.08
    }
}