package com.vtalent.java.mahesh;
public class Mullev {
	  private String name; 
      Mullev(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
    class Employee extends Mullev 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   }; 
    class HourlyEmployee extends Employee 
  { 
      private double hourlyRate; 
      private int hoursWorked; 
      HourlyEmployee(String sname,int id,double hr,int hw) 
      {      
         super(sname,id); 
         hourlyRate = hr; 
         hoursWorked = hw; 
      } 
      public double GetGrosspay() 
      { 
        return (hourlyRate * hoursWorked); 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Hourly Rate = " + hourlyRate); 
        System.out.println("Hours Worked = " + hoursWorked); 
        System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }; 
    class MultilevelInheritance 
 { 
      public static void main(String args[]) 
      { 
         HourlyEmployee emp = new HourlyEmployee("Dinesh Thakur",1,15,1800); 
         emp.display(); 
      } 
}
