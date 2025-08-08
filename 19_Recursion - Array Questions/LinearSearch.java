import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2 , 4, 6, 9, 3, 2, 4, 8};
        System.out.println(find(arr , 4 , 0));
        System.out.println(findIndex(arr , 4 , 0));
        System.out.println(findIndexFromLast(arr , 4, arr.length -1));
        findAllIndex(arr, 4, 0);
        System.out.println(list);

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length ) {
            return false;
        }
        return arr[index] == target || find(arr , target , index + 1);
    }
    static int findIndex(int [] arr , int target , int index ){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index ;
        }
        return findIndex(arr, target, index+ 1);
    }
    static int findIndexFromLast(int [] arr , int target , int index ){
        if(index == -1){
            return -1;
        }
        if(arr[index]== target){
            return index ;
        }
        return findIndexFromLast(arr, target, index - 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int [] arr , int target , int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target ){
            list.add(index);
        }
        findAllIndex(arr , target , index+1); // we can't return this becoz this is void type function
    }
}
