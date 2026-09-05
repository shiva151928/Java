class Generic<T>
{
    private T value;
    public void setdata(T data)
    {
        value=data;
    }
    public void get()
    {
        return value;
    }
}
class prg
{
    public static void main(String args[])
    {
        Generic<Integer> gi;
        Generic<Double> gd;
        gi=new Generic<Integer>();
        gd=new Generic<Double>();
        gi.setdata(100);
        gd.setdata(66.66);
        System.out.print(gi.get());
        System.out.print(gd.get());
    }
}
