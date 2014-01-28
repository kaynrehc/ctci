package Question2_1;

/**
 * User: mchernyak
 * Date: 1/28/14
 * Time: 9:37 AM
 */
public class CharNode {
	private char c;
	private CharNode next;

	public CharNode(char c) {
		this.c = c;
		this.next = null;
	}

	public char getC() {
		return c;
	}

	public CharNode getNext() {
		return next;
	}

	public void setNext(CharNode next) {
		this.next = next;
	}
}
