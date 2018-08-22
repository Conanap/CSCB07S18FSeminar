/**
 * 
 */

/**
 * @author ben
 *
 */
public class Pair<T> {
	private T first;
	private T second;
	
	public Pair(T a, T b) {
		this.first = a;
		this.second = b;
	}
	
	
	public String toString() {
		return "Pair(" + first + "," + second + ")";
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
}
