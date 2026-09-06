class list
{
    private int arr[];
    private int i;
    public void initialize(int val)
    {
        arr=new int(val);
        i=0;
    }
    public void add(int val)
    {
        arr[i]=val;
        i++;
    }
    public void print()
    {
        for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i]);
            }
    }
}
class program
{
    public static void main(String arg[])
    {
        list l=new list();
        l.initialize(5);
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);
        l.print();
    }
}
    }
}
