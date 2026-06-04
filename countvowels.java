import java.util.*;
public class countvowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = {'a','e','i','o','u'};
        Map<Character,Integer>map = new HashMap<>();
        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int vowelcount  = 0;
        int consonantcount = 0;
        for(int i = 0; i <= str.length()-1;i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(map.containsKey(ch)){
                    vowelcount++;
                }else{
                    consonantcount++;
                }
            }
        }
        System.out.println("Vowels = " + vowelcount);
        System.out.println("Consonants = " + consonantcount);
    }
}
