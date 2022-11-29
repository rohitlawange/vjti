import java.util.Scanner;
/**
 *
 * @author ROHIT
 */
class BintoDec 
{   
    static int powplus(int p)
    {   
        int power=1;
        for(int j=0;j<p;j++)
        power*=2;
        return power;
    }
    static double powminus(int q)
    {
        int power=1;
        for(int j=0;j<q;j++)
        power*=2;
        return (1/(double)power);
    }
    public static void main(String args[])
    {	
            Scanner sc=new Scanner(System.in);
            String a="",b="",str="";
            int i,s1=0;
            double s2=0,ans=0;
            System.out.println("Enter your binary no. ");
            str=sc.next();
            for(i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='.')break;
            }
            b=str.substring(i+1);
            a=str.substring(0, i);
            
            for(i=0;i<a.length();i++)
            {
                if(a.charAt(i)=='1')
                s1+=powplus(a.length()-i-1);
            }
            for(i=0;i<b.length();i++)
            {
                if(b.charAt(i)=='1')
                s2+=powminus(i+1);
            }
            ans=s1+s2;
            System.out.println("The decimal equivalent of given binary no.: "+ans);
    }
}
