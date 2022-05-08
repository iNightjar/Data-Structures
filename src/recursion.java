package datastructure;
import java.util.*;
public class recursion {
    public static int power(int n, int sub, int total)
    {
        if (sub==0)
        {
            return total;
        }
           /* // 2^3 = 2*2*2
            int result = 1;
            result *=n ;
            return result * power(n , sub-1 ); */
        return power(n, sub-1,n * total);
    }
    public static int mul(int num1,int num2) {
        if (num2 > num1)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int result= 0;
        if (num1 == num2)
        {
            result = num1;
            return result;
        }
            result = num1 * mul(num1 -1,num2 );
            return result;
    }
    public static int sum(int n,int total)
    {
        if (n == 0)
        {
            return total;
        }
        else {
            return sum(n-1 , n +total);
        }
    }
    public static int fact( int num, int total)
    {
        if (num==0){
            return total;
        }
        else
        {
            return fact(num-1 , num*total);
        }
    }
}