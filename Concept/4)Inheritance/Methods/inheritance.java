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
    public void print(int val)
    {
        System.out.print("from child print"+val);
    }
}
class program
{
    public static void main(String args[])
    {
        parent p=new parent();
        p.print();
        p=new child();
        p.print();
        p.print(100); X
        child c;
        c=(child)p;
        c.print(100);
        (p as child).print();
    }
}
        
