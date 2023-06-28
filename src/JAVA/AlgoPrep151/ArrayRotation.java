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
       public static  void  main(String[] args)
       {
           ArrayRotation ar = new ArrayRotation();
           int[] arr = new int [] {1, 2, 3, 4, 5};
           ar.rotate(arr,3);

       }
}
