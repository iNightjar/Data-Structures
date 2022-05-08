package datastructure;

public class sortedarray {
    private int [] data;
    private int nelement =0;
    public sortedarray(int cap)
    {
        data = new int[cap];
    }
    public void insert(int newval)
    {
        int i=0;
        for(;i<nelement;i++)
        {
            if(data[i] > newval)
                break;
        }
        for (int j=nelement ; j> i ; j--)
        {
            data[j] = data[j-1];
        }
        data[i] = newval;
        nelement++;
    }
    public boolean isfull()
    {
        return data.length==nelement;
    }
    public boolean isempty()
    {
        return data.length!=nelement;
    }
    public void deletedvalue(int deletedvalue)
    {
        int i=0;
        for (;i<nelement;i++)
        {
            if (data[i]==deletedvalue)
                break;
        }
        if (i<nelement)
        {
            for (int j=i;j<nelement;j++)
            {
                data[j] = data[j+1];
            }
            nelement--;
        }
        else {
            System.out.println("number not found!");
        }
    }
    public void displaydata()
    {
        for(int i=0;i<nelement;i++)
        {
            System.out.print(data[i] + " | ");
        }
        System.out.println("");
    }
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
