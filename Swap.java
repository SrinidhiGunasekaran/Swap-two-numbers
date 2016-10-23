import java.io.*;
class Swap
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int a,b,temp;
a=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);
}
catch(Exception e)
{
}
}
}
