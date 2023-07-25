package opps;

import java.util.Scanner;

abstract class Shape{
    float area;
    abstract public void acceptInput();
    abstract public void compute();
    public void disp(){
        System.out.println("the area is : " + area);
    }
}
class Square extends Shape{
   private float length;
   public void acceptInput(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Lengrh of square : ");
       length = sc.nextFloat();
   }
   public void compute(){
       area = length*length;
   }
}
class Rectangle extends Shape{
    private float length;
    private float breadth;
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lengrh of Rectangle : ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle : ");
        breadth = sc.nextFloat();
    }
    public void compute(){
        area = length*breadth;
    }
}
class Circle extends Shape{
    private float radius;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lengrh of Circle : ");
        radius = sc.nextFloat();

    }
    public void compute(){
        area = 3.141f*radius*radius;
    }
}
class Geometry {
    public void permit(Shape ref){
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

public class Launch {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();
        g.permit(s);
        g.permit(r);
        g.permit(c);

    }
}
