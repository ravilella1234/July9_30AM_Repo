package com.icici.loans.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeHashMap 
{

	public static void main(String[] args) 
	{
		Map<Integer, Employee1> hasMap = new HashMap<Integer, Employee1>();
		
		Employee1 e1 = new Employee1(101, "ravilella_1");
		Employee1 e2 = new Employee1(102, "ravilella_2");
		Employee1 e3 = new Employee1(103, "ravilella_3");
		Employee1 e4 = new Employee1(104, "ravilella_4");
		
		hasMap.put(e1.geteNo(), e1);
		hasMap.put(e2.geteNo(), e2);
		hasMap.put(e3.geteNo(), e3);
		hasMap.put(e4.geteNo(), e4);
		
		Set<Entry<Integer, Employee1>> entries = hasMap.entrySet();
		for(Entry<Integer, Employee1> emp : entries)
		{
			Integer empId = emp.getKey();
			System.out.println(empId);
			Employee1 employee = emp.getValue();
			employee.display();
		}
		

	}

}
