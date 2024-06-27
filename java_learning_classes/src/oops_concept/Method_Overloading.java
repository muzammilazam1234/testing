package oops_concept;

public class Method_Overloading {
	
	public void getBusDetails (int busNo )
	{
		System.out.println("please enetr the bus no " +busNo);
	}
	
	public void getBusDetails (String busName )
	{
		System.out.println("please enter the bus name " +busName);
	}
	
	public void getBusDetails (String fromBusStand, String toBusStand )
	{
		System.out.println("please enter the bus stand from station " + fromBusStand +"to station " +toBusStand);	
				
	}
	
	public static void main(String[] args) {
		Method_Overloading ob = new Method_Overloading();
		ob.getBusDetails(323);
		ob.getBusDetails("volvo");
		ob.getBusDetails("delhi","jaypur");
		
		
	}

}
