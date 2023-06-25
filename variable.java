class variable{
int a=10;
static int c=30;
public static void main(String [] args)
{
int b=20;
variable v1=new variable();
System.out.println("Instance variable="+v1.a);
System.out.println("Local variable="+b);
System.out.println("static variable="+c);
}
}