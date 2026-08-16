class program 
{
  public static void main(String arg[])
  {
    int arr[][];
    int num=Integer.parseInt(System.console().readLine());
    arr=new int[num][];
    for(int i=0;i<num;i++)
      {
        arr[i]=new int();
      }
    for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
          {
            arr[i][j]=j+1;
          }
      }
    for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
          {
            System.out.println(arr[i][j]);
          }
      }
  }
}
