package datastructure;

public class queueUsingArray {
    private int front, rear, nElement, maxsize;
    private int[]  data;
    public queueUsingArray(int maxsize)
    {   // constractor
        this.front = 0;
        this.rear= -1;
        this.nElement = 0;
        this.maxsize = maxsize;
        this.data = new int[maxsize];
    }
    public void insert(int newVal)
    {
        if (rear == maxsize-1)
        {
            rear = -1;
        }
        rear++;
        data[rear] = newVal;
        nElement++;
    }
    public int delete()
    {
        int val = data[front];
        front++;
        if (front == maxsize)
        {
            front = 0;
        }
        nElement--;
        return val;
    }
    public int beek()
    {
        return data[front];
    }
    public boolean isFull()
    {
        return nElement == maxsize;
    }
    public boolean isEmpty()
    {
        return nElement != maxsize;
    }
}
