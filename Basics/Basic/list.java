class program
  {
    public static void main(String args[])
    {
      list l=new list();
      l.add(100);
      l.add(200);
      l.add(300);
      l.add(400);
      l.add(500);

      l.print();
    }
  }
class list
  {
    int a[];
    a=new int[5];
    int i=0;
    public void add(int val)
      {
          a[i]=val;
          i++;
      }
    public void print()
      {
        for(j=0;j<i;j++)
          {
            System.out.println(a[j]);
          }
    }
}
      
