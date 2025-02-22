package in.ineuron.entities;

public class Employee {
	// instance variables
	private Integer eid;
	private String ename;
	private String eaddress;


	// HAS-A variable injection	
	private Account account;
	

	
	
	
	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEaddress() {
		return eaddress;
	}


	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	 public void display() {
	        System.out.println("**************Account DETAILS************************");
	        if (account != null) {
	            System.out.println("ACCNO    IS    :: " + account.getAccNo());
	            System.out.println("ACCNAME  IS    :: " + account.getAccName());
	            System.out.println("ACCTYPE   IS    :: " + account.getAccType());
	        } else {
	            System.out.println("Account object is null. Unable to display department details.");
	        }

	        System.out.println("***********************************************************");
	        System.out.println("*************EMPLOYEE DETAILS******************************");

	        System.out.println("EID    IS    :: " + eid);
	        System.out.println("ENAME  IS    :: " + ename);
	        System.out.println("EADDRESS IS :: " + eaddress);
	    }

	   

	}




