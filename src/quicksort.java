package datastructure;

public class quicksort{

    private static void quicksort(int []arr, int left, int right)
    {
        int index = partation(arr, left, right);
        if (left < index - 1)
            quicksort(arr,left, index -1);
        if (index < right)
        quicksort(arr, index, right);
    }
    private static int partation(int []arr, int left, int right)
    {
        int pivot = arr[(left + right)/2];
        while (left <= right){
            while(arr[left] < pivot) left++;
            while(arr[right]>pivot) right--;
            if (left <=right)
            {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left ++;
                right--;
            }
        }
        return left;
    }
public static void main(String[]args)
    {
        int [] array = new int[]{30,20,15,35,10};
        quicksort(array , 0 , array.length-1);
        for (int i=0;i<array.length;i++)
        System.out.print(array[i] + " ");
    }
}
