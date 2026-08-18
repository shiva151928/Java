class Math2025
  {
    public int sum(int x,int y)
    {
      return (x+y);
    }
    protected int sub(int x,int y)
    {
      return (x-y);
    }
  }
class Math2026 extends Math2025
  {
    public int mult(int x,int y)
    {
      return (x*y);
    }
    public int substact(int x,int y)
    {
      return sub(x,y);
    }
  }
class program 
{
  public static void main(String arg)
  {
    Math2025 m1=new Math2025();
    Math2026 m2=new Math2026();
    System.out.println(m1.sum(100,200));
    System.out.println(m1.sub(200,100)); X
    System.out.println(m2.sum(100,200));
    System.out.println(m2.sub(200,100)); X
    System.out.println(m2.mult(100,200));
    System.out.println(m2.substact(300,100));
  }
}
