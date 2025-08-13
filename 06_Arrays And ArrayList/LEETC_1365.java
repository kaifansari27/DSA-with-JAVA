public class LEETCODE_1365{ 
    public static void main(String[] args) {
        
    }
    public int [] SamallerNmberThanCurrent(int [] nums){
        int [] count = new int [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums.length ; j++){
                if( i != j && nums[i] > nums[j]){
                    count[i]++;  //  count[i] isliye dala hai kyunki count ek array hai, aur hume har number ke liye apna alag counter store karna padta hai. and becoz output is comming in the arrays..
                }
            }
        }
        return count;
    }

}

/*

Jab j == i hoga, nums[i] > nums[j] ka check false hoga (kyunki dono same number hain),
to is case me result galat nahi hoga — lekin logically hum apne aap se compare kar hi nahi rahe hote, isliye i != j lagana saaf-suthra approach hai. 

 */