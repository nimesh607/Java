package in.ineuron.test;

import in.ineuron.entities.Account;
import in.ineuron.entities.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		
		acc.setAccName("BOB");
		acc.setAccNo("ISB-222");
		acc.setAccType("current");
		
		
		
		Employee emp1=new Employee();
		emp1.setEid(001);
		emp1.setEname("Nimesh");
		emp1.setEaddress("Ahmedabad");
		emp1.setAccount(acc);
		
		Employee emp2=new Employee();

		emp2.setEid(002);
		emp2.setEname("jay");
		emp2.setEaddress("mumbai");
		emp2.setAccount(acc);
		
		
		Employee emp3=new Employee();
		emp3.setEid(003);
		emp3.setEname("patrick");
		emp3.setEaddress("michigan");
		emp3.setAccount(acc);
		
		
		
		
		
		
		
	 Employee[] employees = new Employee[] { emp1, emp2, emp3 };
	
	
		for(Employee employee:employees)
		{
			employee.display();
			
		}
		
		
		
		
		
		
		

	}

}
