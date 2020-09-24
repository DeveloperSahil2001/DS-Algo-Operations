import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class MyException extends Exception{
    MyException(String s)
    {
     super(s);
    }
}

class Main
{
    static void DemoArray() throws MyException{
      int ar[]=new int [2];
      ar[0]=1;
      ar[1]=2;
      int i=2;
      if(i<=1&&i>=0)
      System.out.println(ar[i]);
      else
      throw new MyException("Array Index out of bounds(-_-)");
}
    public static void main(String[] args)
    {
     try{
        int a=0;
        int b=10;
        b=b/a;
     }
     catch(ArithmeticException e)
     {
      System.out.println(e.getMessage());
     }
     try{
     DemoArray();
     }
     catch(MyException e)
     {
      System.out.println(e);
     }
    }
    }
