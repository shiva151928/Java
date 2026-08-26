class parent
{
    public parent()
  {
      System.out.print("parent constructor");
  }
}
class child extends parent
  {
    public child()
    {
      System.out.print("child constructor");
    }
  }
class program
  {
    public static void main(String args[])
    {
      parent p;
      child c;
      p=new parent();
      c=new child();
    }
  }
o/p:-
  parent constructor 
  child constructor
  parent constructor
