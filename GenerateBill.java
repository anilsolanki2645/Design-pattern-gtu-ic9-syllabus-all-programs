import java.util.*;
abstract class Plan
{
double rate;
abstract void getRate();

void calculateBill(int unit)
{
System.out.println(unit*rate);
}
}
class DomesticPlan extends Plan
{
void getRate()
{
rate=4.0;
}
}
class CommercialPlan extends Plan
{
void getRate()
{
rate=9.0;
}
}
class InstitutionalPlan extends Plan
{
void getRate()
{
rate=7.0;
}
}
class GetPlanFactory
{

Plan getPlan(String plantype)
{
if(plantype==null)
{
return null;
}
if(plantype.equals("DomesticPlan"))
{
return new DomesticPlan();
}
if(plantype.equals("CommercialPlan"))
{
return new CommercialPlan();
}
if(plantype.equals("InstitutionalPlan"))
{
return new InstitutionalPlan();
}
return null;
}
}
class GenerateBill
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter plantype:");
String pt=s.next();
GetPlanFactory gf=new GetPlanFactory();

Plan p=gf.getPlan(pt);
p.getRate();
System.out.println("enter unit:");
int un=s.nextInt();
p.calculateBill(un);
}
}