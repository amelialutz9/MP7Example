/**
 * The class to describe a user.
 * @author amelialutz
 *
 */
public class Human {
	private String name;
	private String key;
	
	public Human(final String name, final String key) {
		this.name = name;
		this.key = key;
	}
	
	public String toString() {
		String ans = "name: " + name + "\nKey: " + key;
		return ans;
	}

	public String getKey() {
		return key;
	}
}
