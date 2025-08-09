import java.util.ArrayList;
public class ReturningArrayList{
    public static void main(String[] args){
        int [] arr = {2, 4, 5, 6, 4, 8};
        System.out.println(find(arr , 4 , 0 , new ArrayList<>()));

    }
    static ArrayList<Integer> find(int [] arr, int target, int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return find(arr , target , index+1 , list);
    }
    
}