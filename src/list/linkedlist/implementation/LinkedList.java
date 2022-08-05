package list.linkedlist.implementation;

import org.w3c.dom.Node;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	// node = vertex = element
	private class Node {
		// 데이터가 저장될 필드
		private Object data;
		// 다음 노드를 가르키는 필드
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;

		}

//		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
//		public String toString() {
//			return String.valueOf(this.data);
//		}
	}
	
	//데이터 추가
	//시작에 추가
	public void addFirst(Object input) {
		// 노드를 생성합니다.
		Node temp = new Node(input);
		// 새로운 노드의 다음 노드로 헤드를 지정
		temp.next = head;
		//헤드로 새로운 노드를 지정
		head = temp;
		size++;

		// 노드가 1개일 때 헤드=테일
		if (head.next == null) {
			tail = head;
		}

	}
	
	//끝에 추가
	public void addLast(Object input) {
		//노드를 생성
		Node newNode = new Node(input);
		//리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드 사용
		if (size == 0) {
			addFirst(input);
		} else {
			//마지막 노드의 다음 노드로 생성한 노드를 지정
			tail.next = newNode;
			//마지막 노드를 갱신
			tail = newNode;
			// 엘리먼트 개수를  증가
			size++;
		}
		
	}
	
	//중간에 추가
	 Node node(int index) {
		Node x = head;
//		x = x.next;
//		x = x.next;
		
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}
	 
	 public void add(int k, Object input) {
		 if (k==0 ) {
			 addFirst(input);
		 } else {
			 Node temp1 = node(k-1);
			 Node temp2 = temp1.next;
			 Node newNode = new Node(input);
			 temp1.next = newNode;
			 newNode.next = temp2;
			 size++;
			 if (newNode.next == null) {
				 tail = newNode;
			 }
		 }
	 }
	 
	 
	 //출력
	 public String toStirng() {
		 //노드(헤드)가 없다면 []를 리턴
		 if (head == null) {
			 return "[]";
		 }
		 //탐색을 시작
		 Node temp = head;
		 String str = "[";
		 
		 //다음 노드가 없을 때까지 반복문을 실행
		 //마지막 노드는 다음 노드가 없기 때문에 마지막 노드는 반복 제외
		 while(temp.next != null) {
			 str += temp.data + ", ";
			 temp = temp.next;
		 }
		 
		 //마지막 노드를 출력결과에 포함
		 str += temp.data;
		 return str+"]";
	 }
	 

}
