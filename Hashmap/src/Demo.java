import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		
		hm.put("Delhi",100000);
		hm.put("Ahmedabad",50000);
		hm.put("Mahastra", 50000);
		hm.put("Pune", null);
		hm.put("Pune",470000);
		hm.put(null,500000);
		System.out.println(hm);
	System.out.println(hm.containsKey(null));
	System.out.println(hm.containsKey("Pune"));
	System.out.println(hm.get("Delhi"));//gets the value of key
	System.out.println(hm.get("jk"));
	//Update value
	hm.put("Mahastra",450000);
	System.out.println(hm.get("Mahastra"));
	//remove
	hm.remove("Delhi");
	System.out.println(hm);
	System.out.println(hm.size());
	//Print
	//1)Get all keys
	//2)Use key to go value
	//3)keySet->all the keys
	System.out.println(hm.keySet());
	for(String state:hm.keySet())
	{
		System.out.println(state + "  "+ hm.get(state));
	}
	
	}

}
