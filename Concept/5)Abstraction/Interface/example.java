interface IMath2022
{
    int sum(int x,int y);
}
interface IMath2023 extends IMath2022
{
    int mult(int x,int y);
}
interface IMath2024
{
    int substract(int x,int y);
}
class Math2026 implements IMath2023,IMath2024
{
    public int sum(int x,int y)
    {
        return (x+y);
    }
    public int mult(int x,int y)
    {
        return (x*y);
    }
    public int substract(int x,int y)
    {
        return (x-y);
    }
    public int div(int x,int y)
    {
        return (x/y);
    }
}
class program
{
    public static void main(String args[])
    {
        IMath2022 m1;
        IMath2023 m2;
        IMath2024 m3;
        Math2026 m=new Math2026();
        System.out.print(m.sum(100,200));
        System.out.print(m.mult(100,200));
        System.out.print(m.substract(100,200));
        System.out.print(m.div(100,200));

        m1=m;
        System.out.print(m1.sum(100,200));
        m2=m;
        System.out.print(m2.sum(100,200));
        System.out.print(m2.mult(100,200));
        m3=m;
        System.out.print(m3.substract(100,200));
        System.out.print(((Math2026)m3).div(100,200));
    }
}
