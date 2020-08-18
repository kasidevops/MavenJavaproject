package org.capgm;

public class Employee {
	int EmpId;
	String EmpName;
	public Employee(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
		
	}
	
@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
	      Employee e= (Employee)o;
	      if(this.EmpId==e.EmpId&&this.EmpName.equals(e.EmpName))
	      {
	      
		return true;
	      }
	      else
	      {
	    	  return false;
	      }
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return EmpId+EmpName.hashCode();
	//return 55;
	}



	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}

public static void main(String args[])
{
	Employee emp1=new Employee(101,"keeru");
	Employee emp2=new Employee(103,"shalu");
	Employee emp3=new Employee(101,"keeru");
	Employee emp4=new Employee(102,"sru");
	System.out.println(emp1.EmpId+" "+emp1.EmpName+" "+emp1.hashCode()+" "+System.identityHashCode(emp1));
	System.out.println(emp2.EmpId+" "+emp2.EmpName+" "+emp2.hashCode()+" "+System.identityHashCode(emp2));
	System.out.println(emp3.EmpId+" "+emp3.EmpName+" "+emp3.hashCode()+" "+System.identityHashCode(emp3));
	//System.out.println(emp1.toString());
	System.out.println(emp1.equals(emp2));
	System.out.println(emp1.equals(emp3));
	System.out.println(emp1.equals(emp4));
}
}

