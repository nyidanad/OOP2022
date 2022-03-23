package mypersons;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Person[] array = new Person[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = readPerson();
			System.out.println(array[i]);
		}
		
		System.out.println("Adult avg. age: " + avgAge(array));
	}
	
	public static double avgAge(Person[] array) {
		double avg = 0;
		int counter = 0;
		for(Person p : array) {
			if(p instanceof Adult) {
				avg += p.getAge();
				counter++;
			}
		}
		
		return avg/counter;
	}
	
	public static Person readPerson() {
		Scanner input = new Scanner(System.in);
		boolean ok;
		int age = 0;
		
		//name
		System.out.println("Name: ");
		String name = input.nextLine();
		
		//age
		do{
			ok = false;
			System.out.print("Age: ");
			if(input.hasNextInt()){
				ok = true;
				age = input.nextInt();
			}	
		}while(!ok || age < 1 || age > 100);
		input.nextLine();
		
		Person p;
		
		//school or workplace
		if(age <= 18) {
			System.out.println("School: ");
			String school = input.nextLine();
			p = new Chield(name, age, school);
		}
		else {
			System.out.println("Workplace: ");
			String workplace = input.nextLine();
			p = new Adult(name, age, workplace);
			
			if(workplace.equals("")) {
				int salary = input.nextInt();
				p = new Employe(name, age, workplace, salary);
			}
		}
		
		return p;
	}

}
