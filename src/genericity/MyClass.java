package genericity;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	
	T[] val;
	
	MyClass(T[] o){
		val = o;
	}

	@Override
	public T min() {
		T t = val[0];
		
		for(int i = 0;i < val.length;i ++) {
			if(val[i].compareTo(t) < 0) {
				t = val[i];
			}
		}
		
		return t;
	}

	@Override
	public T max() {
		T t = val[0];
		
		for(int i = 0;i < val.length;i ++) {
			if(val[i].compareTo(t) > 0) {
				t = val[i];
			}
					
		}
		return t;
	}

	
}
