package opps;

import java.util.Scanner;

class Square {
    float length;
    float area;
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lengrh of square : ");
        length = sc.nextFloat();
    }
    public void compute(){
        area = length*length;
    }
    public void disp(){
        System.out.println("the area of square is : " + area);
    }
}
class Rectangle {
    float length;
    float breadth;
    float area;
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
    public void disp(){
        System.out.println("the area of Rcetangle is : " + area);
    }
}
class Circle {
    float radius;
    float area;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lengrh of Circle : ");
        radius = sc.nextFloat();

    }
    public void compute(){
        area = 3.141f*radius*radius;
    }
    public void disp(){
        System.out.println("the area of Circle is : " + area);
    }
}

public class Launch1 {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();

    }
}

