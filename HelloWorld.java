public class HelloWorld {
    public static void main(String[] args){
        String str = "hello world";
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                System.out.print("*");
            }else if(ch == ' '){
                System.out.print(" ");
            }else{
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
