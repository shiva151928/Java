class program
  {
    public static void main(String args[])
    {
      List l=new List();
      l.init(5);
      l.add(100);
      l.add(200);
      l.add(300);
      l.add(400);
      l.add(500);
      l.print();
    }
  }
class List
  {
    int arr[];
    int i;
    public void init(int val)
    {
      arr=new int[val];
      i=0;
    }
    public void add(int val)
    {
      arr[i]=val;
      i++;
    }
    public void print()
    {
      for(int j=0;j<i;j++)
        {
          System.out.print(arr[j]);
        }
    }
  }
