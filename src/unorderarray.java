package datastructure;

public class unorderarray {
    private int[] data;
    private int nelement = 0;

    public unorderarray(int cap) {
        data = new int[cap];
    }

    public void insert(int newval) {
        data[nelement] = newval;
        nelement++;
    }

    public void search(int searchkey) {
        int counter = 0;
        for (int i = 0; i < nelement; i++) {
            if (data[i] == searchkey) {
                counter++;
                System.out.println(i + " " + counter);
                // return true;
            }
        }
    }

    public boolean isfull() {
        return nelement == data.length;
    }

    public boolean isempty() {
        return nelement != data.length;
    }

    public void displaydata() {
        for (int val : data) {
            System.out.print(val + " , ");

        }
        System.out.println("");
    }

    public int deletefirstmatch(int deletedval) {
        // saerch
        int oldval = 0;
        int i = 0;
        for (; i < nelement; i++) {
            if (data[i] == deletedval) {
                oldval = data[i];
                break;
            }
        }// shift
        if (i < nelement) {
            for (int j = i; j < nelement; j++) {
                data[j] = data[j + 1];
            }
            nelement--;
            return oldval;
        } else {
            System.out.println("Not found!");
            return oldval;
        }
    }
}