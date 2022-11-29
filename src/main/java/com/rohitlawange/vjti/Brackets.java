import java.util.Scanner;
class Brackets
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter your expression:");
		str=sc.next();
		char ch;
		int l=str.length(),c=0,b=0;
		char stk[]=new char[l];
		for(int i=0;i<l;i++)
		{
			ch=str.charAt[i];
			if(ch=='('||ch=='['||ch=='{')
			{	
				b++;
				stk[b]=ch; c++;
			}
			if(ch==']'||ch==']'||ch=='}')
			{
				b--; c--;
			}
			if(c<0) break;
		}
		if(c==0)
		{
			System.out.println("Valid expression");
		}
		else 
		{
			System.out.println("Invalid expression");
		}
	}	
}