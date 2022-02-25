package pkg;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		MyClass<Integer> obj = new MyClass<>();
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(23);
		arrList1.add(43);
		arrList1.add(66);
		System.out.println(obj.maxValue(arrList1));
		System.out.println(obj.minValue(arrList1));
		
		
		MyClass<String> obj2 = new MyClass<>();
		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("ab");
		arrList2.add("ac");
		arrList2.add("ad");
		System.out.println(obj2.maxValue(arrList2));
		System.out.println(obj2.minValue(arrList2));
	}

}
