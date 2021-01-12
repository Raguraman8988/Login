package com.workspace.org;

public class SwitchDemo {
	
	public void demo1() {
		
		int empId=100;
		
		switch (empId) {
		case 1:
			System.out.println("EmpId is 1");
			break;
			
		case 11:
			System.out.println("EmpId is 11");
			break;
		
		case 111:
			System.out.println("EmpId is 111");
			break;
			
		default:
			System.out.println("Invalid EmpId");
			break;
		}
	}
	
	public void demo2() {
		
		String empName= "AA";
		switch (empName) {
		case "A":
			System.out.println("Emp Name A");
			break;
		
		case "AA":
			System.out.println("Emp Name AA");
			break;
			
		case "AAA":
			System.out.println("Emp Name AAA");
			break;
			
		default:
			System.out.println("Invalid Emp Name");
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		SwitchDemo sd = new SwitchDemo();
		sd.demo1();
		sd.demo2();
	}

}
