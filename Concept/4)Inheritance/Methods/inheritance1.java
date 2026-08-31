class parent
  {
    public void print()
    {
      System.out.print("from parent print");
    }
  }
class child extends parent
  {
    public void print()
    {
      System.out.print("from child print");
    }
  }
class program
  {
    public static void main(string arg[])
    {
      parent p=new parent();
      child c=new child();
    }
  }
