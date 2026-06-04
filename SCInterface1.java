interface Member{
    public void callback();
}

class Store{
     Member members[] = new Member[10];
     int count = 0;
     void register (Member m){
        members[count++]=m;
     }
     void Invitesale(){
        for(int i = 0; i < count; i++){
            members[i].callback();
        }
     }

}
class customer implements Member{
    String name;
    customer(String n){
        name = n;
    }
    public void callback(){
        System.out.println("I will visit the store "+name);
    }
}


public class SCInterface1 {
    public static void main(String[] args){
        Store s = new Store();
        customer c1=new customer("John");
        customer c2=new customer("Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.Invitesale();
    }
}
