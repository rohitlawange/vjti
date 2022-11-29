import java.util.Scanner;

class Maths{

static String convert(int dec){
	String bin="";
	for(int i=0;i<8;i++)
	{	
 	if(dec%2==0)
 	bin="0"+bin;
	else 
	bin="1"+bin;
        dec/=2;
	}
	return bin;}

static String twos(int dec){
	dec=dec-2*dec;
	String bin="";
	for(int i=0;i<8;i++)
	{	
 	if(dec%2==0)
 	bin="1"+bin;
	else 
	bin="0"+bin;
        dec/=2;
	}
	String bin2="";
	int i;
	for(i=7;i>=0;i--){
	
	if(bin.charAt(i)=='0')
	{bin2=bin2+'1';	
	break;}

	if(bin.charAt(i)=='1')
	bin2=bin2+'0';
	
}
bin2=bin.substring(0,i)+bin2;
return bin2;}

static int decimal(String s){
int f=0;
for(int i=7,j=0;i>=1;i--)
{
if(s.charAt(i)=='1')
f+=Math.pow(2,j++);

if(s.charAt(i)=='0')
{j++;
	continue;
}
}
return f;
}






public static void main(String args[]){
	String add;
	int a,b;
	a=b=0;
	add="";
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	String s1,s2;
	s1=s2="";
	System.out.println("Enter 1 to add and 2 to subtract");
	int ch=0;
	ch=sc.nextInt();
	s1=convert(a);
	if(ch==1)s2=convert(b);
	if(ch==2) s2=twos(b);
	System.out.println("Twos complement of " +a +" is "+s1+" and of "+b+" is "+s2);


	String sum;
	int count,carry;
	sum="";
	carry=0;
	for(int j=7;j>=0;j--){
	
	count=0;
	if(s1.charAt(j)=='1')count++;	
	if(s2.charAt(j)=='1')count++;
	if(carry==1)count++;
	switch(count){
	case 0:sum="0"+sum;carry=0;break;
	case 1:sum="1"+sum;carry=0;break;
	case 2:sum="0"+sum;carry=1;break;
	case 3:sum="1"+sum;carry=1;break;
	}
	}

	System.out.print("The sum is : "+sum+" and its decimal value is: ");
	if(a<b&&ch==2){

	String bin="";
	for(int i=0;i<8;i++)
	{	
 	if(sum.charAt(i)=='0')
 	bin+="1";
	else 
	bin+="0";
        
	}

	
	String bin2="";
	int i;
	for(i=7;i>=0;i--){
	
	if(bin.charAt(i)=='0')
	{bin2='1'+bin2;	
	break;}

	if(bin.charAt(i)=='1')
	bin2='0'+bin2;
	
	}
bin2=bin.substring(0,i)+bin2;	
sum=bin2;
System.out.print("-");}


	int m=decimal(sum);	






System.out.println(m);	
    }
}
