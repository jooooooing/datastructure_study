package list.arrayList.implementation;

import list.arrayList.implementation.ArrayList.ListIterator;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {

		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);

		numbers.add(1, 15);
		numbers.addFirst(5);

		System.out.println(numbers);
		System.out.println(numbers.remove(1));

		numbers.removeFirst();
		numbers.removeLast();
		System.out.println(numbers);

		// ArrayList의 장점 : 빠른 검색
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));

		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(20));
		System.out.println(numbers.indexOf(50));

		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next()); 
		}

		System.out.println(li.next()); //10
		System.out.println(li.next()); //20
		System.out.println(li.next()); //30
		System.out.println(li.next()); //40
		System.out.println(li.previous()); //40
		System.out.println(li.previous()); //30
		System.out.println(li.previous()); //20
		System.out.println(li.previous()); //10
		System.out.println(li.previous()); //error
		System.out.println(li.hasPrevious()); //error

		// 처음부터 끝까지 갔다가 다시 돌아오는 반복문
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

		// 추가
		while (li.hasNext()) {
			int number = (int) li.next();
			if (number == 30) {
				li.add(35);
			}
		}
		System.out.println(numbers);

		// 삭제
		while (li.hasNext()) {
			int number = (int) li.next();
			if (number == 30) {
				li.remove();
			}
		}
		System.out.println(numbers);
	}

}
