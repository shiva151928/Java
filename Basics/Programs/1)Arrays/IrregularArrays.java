class program
  {
    public static void main(String arg[])
    {
      int arr[][];
      arr=new int[5][];
      arr[0]=new int[1];
      arr[1]=new int[3];
      arr[2]=new int[5];
      for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr[i].length;j++)
            {
              arr[i][j]=j;
            }
        }
      for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
            {
              System.out.print(arr[i][j]);
            }
        }
    }
  }
