import java.util.Scanner;

/**
 *
 * @author ROHIT
 */
public class DecToBin 
{
 public static void main(String args[])
    {	
            Scanner sc=new Scanner(System.in);
            String o1="",o2="";
            int ar[]=new int[20];
            int arr[]=new int[20];
            System.out.println("Enter your decimal no. and precision level: ");
            float f=sc.nextFloat();
            int p=sc.nextInt();
            int a=(int)f;
            if(a>0) 
            {
                while(a!=0)
                {
                    o1=a%2+o1;
                    a/=2;
                }
                float d=(f-a)*2;
                for(int i=0;i<p;i++)
                {
                    if(d>=1)
                    { o2=o2+"1"; d-=1; }
                    else
                    { o2+="0"; d*=2; }    
                } 
                System.out.println("The Binary Form is: "+o1+"."+o2);
            }
            else
            {   
                a=-a; float b=-f-a; b*=2;
                while(a!=0)
                {
                    o1=a%2+o1;
                    a/=2;
                }
                System.out.print(o1);
                System.out.println("");
                 
                
                
                for(int i=0;i<o1.length();i++)
                {
                    if(o1.charAt(i)==0) ar[i]=1;
                    else
                       ar[i]=0;
                }
              
                for(int i=0;i<o1.length();i++)
                System.out.print(ar[i]);
                
                
                
                
                for(int i=o1.length()-1;i>=0;i--)
                {
                    if(ar[i]==1) 
                    {
                        arr[i]=0;
                    }
                    else
                    {
                        arr[i]=1;break;
                    }
                }
                for(int i=0;i<o1.length();i++)
                System.out.print(arr[i]);
                for(int i=0;i<p;i++)
                {
                    if(b>=1)
                    { o2=o2+"1"; b-=1; }
                    else
                    { o2+="0"; b*=2; }    
                } 
                 
                 System.out.print('.'+o2);
                 
            }
            
    }
}
