package main;

import method.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String field1, field2;
		System.out.println("==========Equals Method==========");
		System.out.print("String pertama:");
		field1 = input.nextLine();
		System.out.print("String kedua:");
		field2 = input.nextLine();
		Equals eq = new Equals(field1, field2);
		eq.setField1("didi");
		System.out.println("Hasilnya adalah :" + eq.equal());

		System.out.println("========ToString Method========");
		Tostring s1 = new Tostring(44, "Dudung");
		System.out.println(s1.toString());

		System.out.println("========Percobaan Array Menggunakan Tostring");
		int[] intarr = new int[] { 1, 5, 3, 5, 6 };
		System.out.println(Arrays.toString(intarr));

		System.out.println("Ini tambahan");
		System.out.println("ini tambahan kedua ichlas");
		System.out.println("ini tambahan ketiga ichlas");
		System.out.println("ini tambahan keempat ichlas");
		System.out.println("ini tambahan kelima ichlas");
	}
}