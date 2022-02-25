package pkg;

import java.util.*;

public class MyClass<T> implements MyInterface<T> {

	@Override
	public T product(int T1, int T2) {
		return null;
	}
	
	@Override
	public <T extends Comparable<? super T>> T maxValue(Collection<T> c) {
	    return Collections.max(c);
	}
	
	@Override
	public <T extends Comparable<? super T>> T minValue(Collection<T> c) {
		return Collections.min(c);
	}
	
	@Override
	public T sum(int index1, int index2) {
		return null;
	}
	
	
}
