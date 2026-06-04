
class Circle{
    
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Circle1{
    public static void main(String[] args){
       // circle c = new circle();
        Cylinder c1 = new Cylinder();
        c1.radius = 12;
        c1.height = 12;
        System.out.println("Area is "+c1.area());
        System.out.println("volume is "+c1.volume());
    }
}