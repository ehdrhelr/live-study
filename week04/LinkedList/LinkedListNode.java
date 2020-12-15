class LinkedList { // 노드를 감싼 Linked List를 구현
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedList() {
        header = new Node();
    }

    void add(int d) { 
        Node end = new Node();
        end.data = d;
        Node n = header;
        while (n.next != null) { // 마지막 값을 찾아간다.
            n = n.next;
        }
        n.next = end; // 마지막 값에 붙인다.
    }

    void remove(int d) {
        Node n = header;
        while (n.next != null) { // 마지막 전 노드까지 돈다.
            if (n.next.data == d) {
                n.next = n.next.next; // 다음 노드의 데이터 값이 매개변수와 같으면 다음 노드에 대한 link를 다다음 노드에 연결한다. 
            } else {
                n = n.next; // 아니면 다음 노드로 간다.
            }
        }
    }

    void retrive() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    void removeDups() {
        Node n = header;
        while (n != null && n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(2);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(2);
        ll.retrive();
        ll.removeDups();
        ll.retrive();
    }
}