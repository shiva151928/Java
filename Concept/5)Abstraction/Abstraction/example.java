abstract class myabst
{
    public int sum(int x,int y)
    {
            return (x+y);
    }
    public abstract int substract(int x,int y)
}
class Math extends myabst
{
    public int substract(int x,int y)
    {
        return (x-y);
    }
    public int mult(int x,int y)
    {
        return (x*y);
    }
}
class program
{
    public static void main(String arg[])
    {
        myabst ma;
        math m=new math();
        ma=new myabstr(); X
        System.out.print(m.sum(50,50));
        System.out.print(m.substract(50,10));
        System.out.print(m.mult(50,2));
        m=ma; X
        ma=m;
        System.out.print(ma.sum(50,10));
        System.out.print(ma.substract(50,2));
        System.out.print(((math)ma).mult(50,2));
    }
}
    
