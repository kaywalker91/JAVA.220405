package Study0405;

import java.util.Scanner;

public class Study06_sc_pr_int_double {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
	double key;
	
	System.out.print("������ �Է��ϼ���:");
	age = sc.nextInt();
	
	System.out.print("Ű�� �Է��ϼ���:");
	key = sc.nextDouble();
	
	System.out.print("�̸��� �Է��ϼ���:");
	name = sc.next();
	
	System.out.println(name + " / " + age+"�� / " + key + "cm");


	}

}
