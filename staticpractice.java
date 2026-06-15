class pest{
    static int x = 10;
    int y = 10;

    static void display(){
        System.out.println("The value of x is " + x);
    }
    void show(){
        System.out.printf("The value of x and y is : %d %d ", x, y);
    }
}

public class staticpractice {
    public static void main(String[] args){
        pest.display();
        pest t = new pest();
        t.show();

    }
}
