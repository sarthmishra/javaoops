class outer{
    public void display(){
        int x = 10;
        class inner{
            public void show(){
                System.out.println("this is an inner class");
            }
        }
       new inner().show();
       //inner i = new inner();
       //i.show();
    }
    
}



public class localinnerclass {
    public static void main(String[] args){
        outer o = new outer();
        o.display();
    }
}
