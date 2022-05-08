package datastructure;
public class BinarySearchinSortedArray { // binarysaerch for Sorted Array
    private int [] data;
    private int nelement =0;
    public boolean binarysearch(int value)
    {
        int min=0;
        int max = nelement-1;
        int mid;
        while(true)
        {
            mid = (min + max)/2;
            if (data[mid]==value)
            {
                return true;
            }
            else{
                if (value>data[mid])
                {
                    min=mid+1;
                }
                else{
                    max = mid-1;
                }
                if (min > max)
                {
                    return false;
                }
            }
        }
    }
}