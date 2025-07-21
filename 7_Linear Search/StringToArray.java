import java.util.Arrays;
public class StringToArray {
    public static void main(String[] args) {
        String name = "Kaif";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str , char target){
        for(int i = 0 ; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false ;
    }
}
