package Study0405;

import java.util.Scanner;

public class Study06_sc_pr_int_double {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
	double key;
	
	System.out.print("나이을 입력하세요:");
	age = sc.nextInt();
	
	System.out.print("키을 입력하세요:");
	key = sc.nextDouble();
	
	System.out.print("이름을 입력하세요:");
	name = sc.next();
	
	System.out.println(name + " / " + age+"세 / " + key + "cm");


	}

}
