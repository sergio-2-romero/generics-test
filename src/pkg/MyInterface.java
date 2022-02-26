package pkg;

import java.util.Collection;

public interface MyInterface<T> {
	
	T product(int index1, int index2);
	
	@SuppressWarnings("hiding")
	<T extends Comparable<? super T>> T maxValue(Collection<T> c);
	
	@SuppressWarnings("hiding")
	<T extends Comparable<? super T>> T minValue(Collection<T> c);
	
	T sum(int index1, int index2);
	
}
