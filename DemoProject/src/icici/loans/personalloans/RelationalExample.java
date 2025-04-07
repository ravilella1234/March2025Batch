package icici.loans.personalloans;

public class RelationalExample 
{

	public static void main(String[] args) 
	{
		int x =20 , y =10;
		
		System.out.println("X==Y --> " + (x==y));
		System.out.printf("%d==%d  %b \n",x,y,(x==y));
		System.out.printf("%d!=%d  %b %n",x,y,(x!=y));
		System.out.printf("%d<%d  %b %n",x,y,(x<y));
		System.out.printf("%d>%d  %b %n",x,y,(x>y));
		System.out.printf("%d<=%d  %b %n",x,y,(x<=y));
		System.out.printf("%d>=%d  %b %n",x,y,(x>=y));
	}

}
