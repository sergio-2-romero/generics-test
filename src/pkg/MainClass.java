package pkg;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(23);
		arrList1.add(43);
		arrList1.add(66);
		
		ArrayList<Double> arrList2 = new ArrayList<Double>();
		arrList2.add(4.3);
		arrList2.add(2.3);
		arrList2.add(6.5);
		
		MyClass<Integer> obj1 = new MyClass<>(arrList1);
		System.out.println("Product: " + obj1.product(1, 2));
		System.out.println("Max Value: " + obj1.maxValue(arrList1));
		System.out.println("Min Value: " +obj1.minValue(arrList1));
		
		System.out.println("");
		
		MyClass<Double> obj2 = new MyClass<>(arrList2);
		System.out.println("Product: " + obj2.product(0, 2));
		System.out.println("Max Value: " + obj2.maxValue(arrList2));
		System.out.println("Min Value: " +obj2.minValue(arrList2));
	}

}
