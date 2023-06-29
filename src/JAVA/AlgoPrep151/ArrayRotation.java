package JAVA.AlgoPrep151;

public class ArrayRotation {
        public void rotate(int[] nums, int k) {
            for(int j = 1 ; j <= k ; j++)
            {
                int last = nums[nums.length-1];
                for(int i = nums.length - 1; i > 0; i--)
                {
                    nums[i] = nums[i-1];
                }
                nums[0] = last;
            }
            for(int i = 0; i< nums.length; i++){
                System.out.print(nums[i] + " ");
            }
        }
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0 , k-1);
        reverse(nums,k,nums.length - 1);
    }
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i< nums.length ; i++ )
        {
            sum += nums[i];
            if(sum > maxSum)
            {
                maxSum = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void reverse(int nums[], int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
       public static  void  main(String[] args)
       {
           ArrayRotation ar = new ArrayRotation();
           int[] arr = new int [] {1, 2, 3, 4, 5};
           ar.rotate(arr,3);

       }
}
