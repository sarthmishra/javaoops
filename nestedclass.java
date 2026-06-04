class outer{
    int x = 10;
    class inner{
        int y = 20;
        void Innerdiplay(){
            System.out.println("this is an inner class");
            System.out.println(x);
            System.out.println(y);
        }
    }
 void outerdiplay(){
        inner i = new inner();
        i.Innerdiplay();
        System.out.println(i.y);
    }
}
public class nestedclass{
    public static void main(String[] args){
        outer i = new outer();
        i.outerdiplay();
        System.out.println(i.x);
        outer.inner oi = new outer().new inner();
        //oi.Innerdisplay();
    }
}