class parent
{    
    public void print()
    {
        System.out.print("parent print");
    }
}
class child extends parent
{
    public void print()
    {
        System.out.print("child print");
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
    }
}
