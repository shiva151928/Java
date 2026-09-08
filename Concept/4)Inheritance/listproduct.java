class product 
{
    private int id;
    private String name;
    private double fee;
    public void read()
    {
        id=Integer.parseInt(System.console().readLine());
        name=System.console().readLine();
        fee=double.parseDouble(System.console().readLine());
    }
    public void read()
    {
        System.out.print(id+name+fee);
    }
}
class program
{
    public static void main(String args[])
    {
        product p1=new product();
        p1.read();
        product p2=new product();
        p2.read();
        product p3=new product();
        p3.read();
        list l=new list(5);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.print();
    }
}
class list
{
    private product p[];
    private int i;
    public list(int val)
    {
        p=new product[val];
        i=0;
    }
    public void add(product pr)
    {
        p[i]=pr;
        i++;
    }
    public void print()
    {
        for(int j=0;j<i;j++)
            {
                p[j].print();
            }
    }
}
