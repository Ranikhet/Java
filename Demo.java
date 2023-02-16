class Demo
{
public static void main(String[] args)
{
int sum=0;
for(int i=0;i<args.length;i++)
sum=sum+Integer.parseInt(args[i]);
System.out.println("Sum of two variables"+sum);
//System.out.println("argument 2  "+args[1]);
}

}