package pkg;

import java.util.ArrayList;
import java.util.Collection;

public interface MyInterface<T> {
	
	T product(int index1, int index2);
	
	<T extends Comparable<? super T>> T maxValue(Collection<T> c);
	
	<T extends Comparable<? super T>> T minValue(Collection<T> c);
	
	T sum(int index1, int index2);
	
}
