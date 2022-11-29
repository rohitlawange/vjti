import java.util.Scanner;
class Dec{
public static void main(String args[]){
String bin,dec;
int a;
float b;
a=0;
b=0;
bin=dec="";
Scanner sc=new Scanner(System.in);
dec=sc.next();
for(int i=0;i<dec.length();i++){
        if(dec.charAt(i)=='.')
        {b=Float.parseFloat(dec.substring(i));
         a=Integer.parseInt(dec.substring(0,i));
        }
        }
if(a>0){
while(a!=0)
{if(a%2==0)
bin="0"+bin;
else bin="1"+bin;
a/=2;
}
}

else{
a=a-2*a;
System.out.println(a);

while(a!=0)
{if(a%2==0)
bin="0"+bin;
else bin="1"+bin;
a/=2;
}
String a1,a2;
a1=a2="";
a1+=bin;
for(int i=0;i<a1.length();i++)
        if(a1.charAt(i)==1)
        a2+="0";
        else a2+="1";
int first0=-1;
String fin;
fin="";
for(int j=a2.length()-1;j>=0;j--){
        if(first0==-1){
        if(a2.charAt(j)==1){fin="0"+fin;}
        if(a2.charAt(j)==0){fin="1"+fin;first0=0;}
        }
        else fin=a2.charAt(j)+fin;
        } 
        if(first0==-1)fin="1"+fin;
System.out.print(fin);
}


bin+=".";
for(int j=0;j<5;j++){
if(b==0)break;
b*=2;
bin+=(int)b;
b=b-(int)b;
}



System.out.print(bin);
        }
        }
       
