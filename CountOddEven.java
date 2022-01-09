

//Given an array A of N elements. The task is to count number of even and odd elements in the array


public class CountOddEven {
    static void countOddEven(int a[], int n) {
        long even =0;
        for(int i =0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
        }
        long odd = n -even;
        System.out.print(odd+" "+ even);


    }
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5};
        countOddEven(arr,5);
    }
}
