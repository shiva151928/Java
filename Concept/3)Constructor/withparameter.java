class myclass 
{
  public myclass(int val)
  {
      System.out.print("contructor invoked",val);
  }
}
class program
  {
    public static void main(String args[])
    {
      myclass mc;
      mc=new myclass();
      mc=new myclass(20);
    }
  }
