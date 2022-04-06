package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- Test 1: Department ByID ---");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n--- Test 2: Department findAll ---");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--- Test 3: Department Insert ---");
		Department newDepartment = new Department(null,"Jur�dico");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = "+newDepartment.getId());
		
		System.out.println("\n--- Test 4: Department Update ---");
		department = departmentDao.findById(5);
		department.setName("Financeiro");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n--- Test 5: Department Delete ---");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted Completed!");
		
		sc.close();
	}
}
