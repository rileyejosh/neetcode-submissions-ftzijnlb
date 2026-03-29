public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        int[] a = new int[2];

        int L = 0;
        int R = numbers.Length-1;
        while(L < R) {
            if(numbers[L] + numbers[R] == target) {
                a[0] = L+1;
                a[1] = R+1;
                break;
            }
            else if(numbers[L] + numbers[R] > target)
            {
                R--;
            }   
            else if(numbers[L] + numbers[R] < target) 
            {
                L++;
            }
            
        }

        return a;

    }
}
