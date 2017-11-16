import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implement Sieve algo to find prime numbers
 * @author isabelle delmas
 *
 */
public class Sieve {
	private int limit;
	
	/**
	 * Constructor
	 * @param upperLimit upper limit for prime numbers
	 */
	public Sieve(int upperLimit) {
		this.limit = upperLimit;
	}

	/**
	 * Get all the primes less than or equal to the upper limit
	 * @return
	 */
	public Set<Integer> getPrimes(){
		Set<Integer> set = new TreeSet<>();
		int sqrt = (int) Math.sqrt(this.limit);
		
		// Populate the set (0 and 1 are not prime numbers)
		for(int i = 2; i <= this.limit ; i++) {
			set.add(i);
		}
		
		// Goes through the list all the way to sqrt(limit)
		for(int i = 2; i <= sqrt; i++) {
			// Remove all the elements multiple of i (but not i itself) only if i is still in the set
			if(set.contains(i)){
				Iterator<Integer> it = set.iterator();
				while(it.hasNext()) {
					Integer temp = it.next();
					if(temp%i == 0 && temp !=i) {
						it.remove();
					}
				}
			}
			
		}
		return set;
	}
	
	/**
	 * Set the new upper limit
	 * @param newLimit new upper limit
	 */
	public void setUpperLimit(int newLimit) {
		this.limit = newLimit;
	}
	/**
	 * Get the number of primes that are less than the upper limit
	 * @return number of primes that are less than the upper limit
	 */
	public int primeCount() {
		return this.getPrimes().size();
	}

}
