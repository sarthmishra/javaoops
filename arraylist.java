import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer>al2 = new ArrayList<>(List.of(10,20,30,40,50));
        al1.add(5);
        al1.add(0, 10);
        al1.addAll(1,al2);
        System.out.println(al1);
        System.out.println(al1.contains(50));
        System.out.println(al1.get(3));
        System.out.println(al1.set(4,5 ));
        for(int i = 0; i < al1.size(); i++){
            System.out.print(al1.get(i)+" ");
        }
        for(int x : al1){
            System.out.println(x + " ");
        }
        Iterator<Integer>it = al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        for(ListIterator<Integer>its = al1.listIterator();its.hasNext();){
       
            System.out.print(its.next()+ " ");
        
            al1.forEach(System.out::println);
           // al1.forEach(n->show(n));
        }
            /*Static void show(int n){
                if(n > 60){
                    System.out.print(n);
                }
            } */
        
    }
}
