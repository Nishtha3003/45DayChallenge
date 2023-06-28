package JAVA;

public class ArrayIntro {
    public  void printArray(int[] arr)
    {
        for(int i =0 ; i< arr.length ; i++)
        {
            System.out.print(arr[i]);
        }

    }
    //MOVE ALL 0 TO END OF ARRAY
    public void moveZeroToEnd(int[] arr)
    {
       int i , j = 0;
       for(i = 0 ; i< arr.length ; i++)
       {
           if(arr[i] != 0 && arr[j] == 0)
           {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
           if(j != 0)
           {
               j++;
           }
       }
       printArray(arr);
    }
    //Find the Secound Max in the Arrar
    public  void secoundMax(int[] arr)
    {
        int max = 0;
        int secoundMax = 0 ;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i]> max)
            {
                secoundMax = max;
                max = arr[i];
            }
            else if(arr[i] > secoundMax && arr[i] != max)
            {
                secoundMax = arr[i];
            }
        }
        System.out.println(secoundMax);

    }    //Remove Even Integer From a Array
    public  void removeEvenInteger(int[] arr)
    {
        int oddCount = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i]%2 != 0)
            {
                oddCount++;
            }
        }
        int[] oddArray = new int[oddCount];
        int j = 0;
        for(int i=0 ; i < arr.length ; i++)
        {
            if(arr[i]%2 != 0)
            {
                oddArray[j] = arr[i];
                j++;
            }
        }
        printArray(oddArray);
    }

    // REVERSE A ARRAY IN JAVA
    public void reverse(int[] arr)
    {
        int len = arr.length;
        int i = 0;
           while(i != ((len/2)))
           {
               int temp = arr[i];
               arr[i] = arr[len-1-i];
               arr[len-1-i] = temp;
               i++;

           }
           printArray(arr);
    }
    //Resize the capacity of array
    public void resize(int[] arr, int capacity)
    {
        int[] temp = new int[capacity];
        for(int i =0 ; i<arr.length; i++)
        {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    // GIVEN an array of (n-1) numbers find the missing number
    public void findMissingNumber(int[] arr)
    {
        int length = arr.length+1;
       int sumEx = (length*(length+1))/2;
       int sum = 0;
       for(int i =0 ; i<arr.length ; i++)
       {
           sum = sum + arr[i];
       }
       int missingNumber = sumEx - sum;
       System.out.println(missingNumber);

    }
    //FIND MINIMUM ELEMENT IN AN ARRAY
    public void findMinElement(int[] arr)
    {
        int min = arr[0];
        int i = 0;

        while(i < arr.length)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
            i++;
        }

        System.out.println(min);

    }
    // FIND MAXIMUM ELEMENT IN AN ARRAY
    public void findMaxElement(int[] arr)
    {
        int min = arr[0];
        int i = 0;

        while(i < arr.length)
        {
            if(min < arr[i])
            {
                min = arr[i];
            }
            i++;
        }

        System.out.println(min);

    }
    public  void ArrayDemo()
    {
        int[] array = new int[5];
        printArray(array);
    }
    public static void main(String[] args)
    {
        ArrayIntro arrayObj = new ArrayIntro();
        arrayObj.findMissingNumber(new int[] {1,2,3,4,6,7,8,9});
    }
}
