class Super{
    public void Display(){System.out.println("super clas");}
}
class sub extends Super{
    public void Display(){System.out.println("Sub class");}
}

public class overeloading {
    public static void main(String[]args){
        Super s = new Super();
        s.Display();
    }
}
