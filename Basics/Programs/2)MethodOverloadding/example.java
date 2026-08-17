class math
  {
    public int sum(int x,int y)
    {
      return (x+y);
    }
    public float sum(float x,float y)
    {
      return (x+y);
    }
    public double sum(double x,double y)
    {
      return (x+y);
    }
    public int sum(int x,String y)
    {
      return (x+Integer.parseInt(y));
    }
    public int sum(String x,int y)
    {
      return (Integer.parseInt(x)+y);
    }
    public int sum(int x,int y,int z)
    {
      return (x+y+z);
    }
    public String sum(String x,String y)
    {
      return (x+y);
    }
  }
class program
  {
    public static void main(String ar[])
    {
      math m=new math();
      System.out.println(m.sum(100,200));
      System.out.println(m.sum(100.000,200.000));
      System.out.println(m.sum(100.000,200.000));
      System.out.println(m.sum(100,200,300));
      System.out.println(m.sum(100,"200"));
      System.out.println(m.sum("100",200));
      System.out.println(m.sum("ravi","Kumar"));
    }
  }
