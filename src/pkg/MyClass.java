package pkg;

import java.util.*;

public class MyClass<T extends Number> implements MyInterface<T> {
	
	ArrayList<T> arr;
	
	MyClass(ArrayList<T> arr) {
		this.arr = arr;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T product(int t1, int t2) {
		Class<? extends Number> cls = arr.get(t1).getClass();
	    if (cls == Integer.class) {
	        return (T) Integer.valueOf(arr.get(t1).intValue() * arr.get(t2).intValue());
	    }
	    if (cls == Double.class) {
	    	return (T) Double.valueOf(arr.get(t1).doubleValue() * arr.get(t2).doubleValue());
	    }
	    throw new UnsupportedOperationException("Not supported class: " + cls);
	}
	
	@SuppressWarnings("hiding")
	@Override
	public <T extends Comparable<? super T>> T maxValue(Collection<T> c) {
	    return Collections.max(c);
	}
	
	@SuppressWarnings("hiding")
	@Override
	public <T extends Comparable<? super T>> T minValue(Collection<T> c) {
		return Collections.min(c);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T sum(int t1, int t2) {
		Class<? extends Number> cls = arr.get(t1).getClass();
	    if (cls == Integer.class) {
	        return (T) Integer.valueOf(arr.get(t1).intValue() + arr.get(t2).intValue());
	    }
	    if (cls == Double.class) {
	    	return (T) Double.valueOf(arr.get(t1).doubleValue() + arr.get(t2).doubleValue());
	    }
	    throw new UnsupportedOperationException("Not supported class: " + cls);
	}
	
	@SuppressWarnings("unchecked")
	public T factorialAlgorithm(T n) {
	Class<? extends Number> cls = n.getClass();
		if (cls == Integer.class) {
			if (n.intValue() <= 1) {
			     return (T) Integer.valueOf(1);
			  } else {
			     return (T) Long.valueOf(n.intValue() * (factorialAlgorithm((T) Integer.valueOf(n.intValue() - 1))).longValue());
			  }
		}
		return null;
	}
	
	public T factorial(int index1) {
		return factorialAlgorithm(arr.get(index1));
	}

	
	//public T prime(int index1) {
		//return T;
	//}
	
}
