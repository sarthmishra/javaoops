 class outer{
    int x = 10;
    static int y = 20;
    static class My{
        void show(){
            System.out.print(y);
        }
    }
}


public class localinner {
    public static void main(String[] args){
        outer.My o = new outer.My();
        o.show();
    }
}
