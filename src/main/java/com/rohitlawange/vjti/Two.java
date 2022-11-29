import java.util.Scanner;
class Two{
public static void main(String args[]){
String bin;
int dec=0;
int con=0;
bin="";
Scanner sc=new Scanner(System.in);
dec=sc.nextInt();

int s=dec;

for(int i=0;i<8;i++)
{
 if(dec%2==0)
 bin="0"+bin;
else 
 bin="1"+bin;
    dec/=2;
}


System.out.print(bin);
        }
        }


