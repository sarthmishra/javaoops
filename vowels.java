import java.util.*;
public class vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /*int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.print("vowel: "+vowel);
        System.out.print("Consonant: "+consonant); */
        char[] arr = {'a','e','i','o','u'};
        HashSet<Character>set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println("vowel: "+vowel);
        System.out.print("Consonant: "+consonant);
    }
}
