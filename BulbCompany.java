class BulbCompany{
	
	int bulbWatt;
	float bulbPrice;
	String bulbColor;
	boolean bulbState;
	static int bulbQuantity;   // it is representing class property means ki jab ye data ki value har obj ke liye common hai jo same type ke obj hote hai isliye isko static banaye hai.
	static String bulbCompanyName;
	
	static{
		bulbQuantity=0;
		bulbCompanyName="Orient";
		System.out.println("----------------Welcome to"+" "+bulbCompanyName+" "+"Bulb Making Company----------------");
		System.out.println("");
	}
	{
		bulbQuantity++;       //isko hum init block ke andar rakhe hai becoz in future agar hum parametrize constructor banaye then ye quantity++ toh add karega nhi 
	}
	
	BulbCompany()  //agar hum alag alag obj pe same data initilize karna chayte hai tab hum default constructor banate hai.
	{
		 bulbWatt=100;
		 bulbPrice=25;
		 bulbColor="Red";
		 bulbState=true;
	}
	
	BulbCompany(int w, float p, String c, boolean b) // for three different bulb
	{
		 bulbWatt=w;
		 bulbPrice=p;
		 bulbColor=c;
		 bulbState=b;
	}
	
	void showBulbDetails()
	{
		System.out.println("Watt of Bulb "+bulbWatt);
		System.out.println("Color of Bulb "+bulbColor);
		System.out.println("Price of Bulb "+bulbPrice);
		System.out.println("State of Bulb "+bulbState);
		System.out.println("ComanyName of Bulb "+bulbCompanyName);
		
	}
	void changeBulbState()
	{
		if(bulbState==true)
		{
			bulbState=false;
		}
		else
		{
			bulbState=true;
		}
	}
	static void countBulb() // isko humne static isliye banaye becoz hum ye chayte hai bina obj banaye ye method chal jaye
	{
		System.out.println("Total Quantity Of Bulb Is  "+bulbQuantity);
	}
	void changeCompanyName(String cName)
	{
		bulbCompanyName=cName;
	}
	
	public static void main(String args[])
	{
		BulbCompany.countBulb();
		System.out.println("");
		
		System.out.println("-------------Creating Same Type Of Bulb----------");
		System.out.println("");
		BulbCompany b1=new BulbCompany();
		System.out.println("Details of Bulb 1");
		b1.showBulbDetails();
		System.out.println("---------------");
		
		BulbCompany b2=new BulbCompany();
		System.out.println("Details of Bulb 2");
		b2.showBulbDetails();
		System.out.println("---------------");
		
		BulbCompany b3=new BulbCompany();
		System.out.println("Details of Bulb 3");
		b3.showBulbDetails();
		System.out.println("---------------");
		countBulb();
		System.out.println("");
		
		System.out.println("-------Creating Different Type Of Bulb----------");
		System.out.println("");
		BulbCompany b4=new BulbCompany(250,56,"yellow",true);
		System.out.println("Details of Bulb 4");
		System.out.println("");
		b4.showBulbDetails();
		System.out.println("");
		
		
		BulbCompany b5=new BulbCompany(20,16,"Blue",true);
		System.out.println("Details of Bulb 5");
		System.out.println("");
		b5.showBulbDetails();
		System.out.println("");
		
		BulbCompany b6=new BulbCompany(78,500,"Green",false);
		System.out.println("Details of Bulb 6");
		System.out.println("");
		b6.showBulbDetails();
		countBulb();
		System.out.println("");
		
		b6.changeBulbState();
		System.out.println("----------Details Of Bulb 6 After State Change--------");
		b6.showBulbDetails();
		
		b5.changeCompanyName("Samsung");
		System.out.println("----------Details Of Bulb 5 After ComanyName Change--------");
		
		b5.showBulbDetails();
		
		
		
	}
	
}