package datastructure;

import java.io.OutputStream;

/*
public class Main{ // queueUsingArray
    public static void main(String [] args) {
        queueUsingArray arr = new queueUsingArray(5);
        arr.insert(12);
        arr.insert(11);
        arr.insert(10);
        arr.insert(9);
        arr.insert(8);
        System.out.println("The Result is : "+ arr.beek());
        arr.delete();
        System.out.println("The Result is : "+ arr.beek());
    }

} */
/* public class Main{ // StackUsingArray
    public static void main(String[] args) {
        String s = "iNightjar"; // working with strings
        StackUsingArray str = new StackUsingArray(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            int ch = s.charAt(i); // char that is equal to the ASCII value of string
            str.push(ch);
        }
        while(!str.isEmpty())
        {
            char ch = (char)str.pop();
            System.out.print(ch);
        } /*
       /* StackUsingArray a= new StackUsingArray(3);
        a.push(5);
        a.push(12);
        System.out.println("the Top of The Stack is: " + a.peek());
        System.out.println("the Top of The Stack After pop is : " + a.pop());
    }
} */

/*
public class Main { // recursion algorithms
    public static void main(String[] args) {
        System.out.println("the result is: " + recursion.fact(5,1));
        System.out.println("the result is: " + recursion.sum(5,0));
        System.out.println("the result is : " + recursion.mul(4,1));
       System.out.println("the result is :  " + recursion.power(3,3,1));
    }
}*/

/*
public class Main
{   // unsortedarray .. insert , delete and search
    public static void main(String[] args) {
        unorderarray a = new unorderarray(7);
        a.insert(12);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(37);
        a.insert(10);
        a.search(10);
        a.deletefirstmatch(12);
        a.displaydata();
    }
} */

/*
public class Main
{    // sortedarray .. insert and delete .. binary search
    public static void main(String[]args)
    {
        sortedarray a = new sortedarray(10);
        a.insert(1);
        a.insert(27);
        a.insert(3);
        a.insert(25);
        a.insert(4);
        a.insert(87);
        a.insert(19);
        a.insert(23);
        a.insert(22);
        a.displaydata();
        a.deletedvalue(23);
        a.displaydata();
        System.out.println(a.binarysearch(19));
        a.displaydata();
    }
} */
