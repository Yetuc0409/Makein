//.............mini billing project in java here using class,object,..........................//
import java.io.*;
class rosh 
{
int i,n,a,v,m,unit;
int price,q,tot;
public void getdata()throws IOException
{ 
BufferedReader pr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("how many times entered");
n=Integer.parseInt(pr.readLine());
for(i=1;i<=n;i++)
{
System.out.println("Select your option");
System.out.println("1.VEG list 2.NON VEG list");
a=Integer.parseInt(pr.readLine());
switch(a)
{
case 1:
{
System.out.println("1.veg 2.non veg");
System.out.println("veg list");
System.out.println("1.curd rice  2.lemon rice");
v=Integer.parseInt(pr.readLine());
if(v==1)
{
unit=30;
System.out.println("one curd rice:"+unit);
}
else if(v==2)
{
unit=40;
System.out.println("one lemon rice:"+unit);
}
else
{
System.out.println("no more list");
break;
}
}
case 2:
{
System.out.println("Non veg list");
System.out.println("1.C biriyani  2.M biriyani");
m=Integer.parseInt(pr.readLine());
if(m==1)
{
unit=100;
System.out.println("one C biriyani:"+unit);
}
else if(m==2)
{
unit=150;
System.out.println("one M biriyani:"+unit);
break;
}
else 
{
System.out.println("no more list");
break;
}
}
System.out.println("enter your quantity");
q=Integer.parseInt(pr.readLine());
price=q*unit;
System.out.println("price:"+price);
tot=tot+price;
System.out.println("net price:"+tot);
}
}
}
public static void main(String[]args)throws IOException
{
rosh o=new rosh();
o.getdata();
}
}
