class parent
{
  public parent()
  {
      System.out.print("without parameter");
  }
}
class child
  {
    public child()
    {
      System.out.print("from child");
    }
    public child(int val)
    {
      System.out.print("from child with parameter"+val);
    }
  }
class program
  {
    public static void main(String args[])
    {
      parent p;
      child c;
      p=new parent();
      c=new child(100);
    }
  }
