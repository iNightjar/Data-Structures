package datastructure;

import java.nio.file.StandardOpenOption;

public class StackUsingArray {
    private int top;
    private int[] data ;
    private int maxsize;
    public StackUsingArray(int maxsize)
    {
        this.top = -1;
        this.data = new int[maxsize];
        this.maxsize = maxsize;
    }
    public  void push(int newVal)
    {
        data[++top]  = newVal ;
    }
    public  int peek()
    {
        return data[top];
    }
    public int pop()
    {
        int x = data[top];
        --top;
        return x;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
}