package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(10);
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers);
		
//		System.out.println(numbers.node(2));
//		numbers.add(2, 25); //index 2에 25를 넣음
	}

}
