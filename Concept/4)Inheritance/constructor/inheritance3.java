class parent
  {
    public parent(int val)
    {
      System.out.print("parent constructor invoked"+val);
    }
    public parent()
    {
      System.out.print("parent constructor invoked");
    }
  }
class child extends parent
  {
    public child(int val);
    {
      System.out.print("child construcotr invoked"+val);
    }
  }
class program
  {
    public static void main(String args[])
    {
      parent p;
      child c;
      p=new parent(100);
      c=new child(200);
    }
  }
