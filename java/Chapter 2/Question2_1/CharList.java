package Question2_1;

/**
 * User: mchernyak
 * Date: 1/28/14
 * Time: 9:37 AM
 */
public class CharList {
	private CharNode head = null;

	public void add(char c) {
		CharNode charNode = new CharNode(c);

		if (head == null) {
			head = charNode;
		} else {
			CharNode runner = head;
			while (runner.getNext() != null) {
				runner = runner.getNext();
			}
			runner.setNext(charNode);
		}
	}

	public void remove(char c) {
		if (head == null)
			return;

		if (head.getC() == c) {
			if (head.getNext() == null) {
				head = null;
			} else {
				head = head.getNext();
			}
			return;
		}

		CharNode runner = head;

		while (runner != null) {
			if (runner.getNext() != null && runner.getNext().getC() == c) {
				runner.setNext(runner.getNext().getNext());
			}
			runner = runner.getNext();
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		CharNode runner = head;
		while (runner != null) {
			sb.append(runner.getC());
			runner = runner.getNext();
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		CharList charList = new CharList();
		charList.add('A');
		charList.add('B');
		charList.add('C');
		charList.add('D');
		charList.add('E');

		System.out.println("***** " + charList);
		charList.add('E');
		charList.add('F');
		charList.add('G');

		System.out.println("***** " + charList);

		charList.remove('C');
		System.out.println("***** " + charList);

		charList.remove('E');
		System.out.println("***** " + charList);

		charList.remove('G');
		System.out.println("***** " + charList);

		charList.remove('A');
		System.out.println("***** " + charList);

		charList.remove('B');
		System.out.println("***** " + charList);

		charList.remove('E');
		System.out.println("***** " + charList);

		charList.remove('X');
		System.out.println("***** " + charList);

		charList.remove('F');
		System.out.println("***** " + charList);

		charList.remove('D');
		System.out.println("***** " + charList);

		charList.remove('D');
		System.out.println("***** " + charList);



	}
}
