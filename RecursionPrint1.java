import java.util.Scanner;

public class RecursionPrint1 {

    public static Node<Integer> Input() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();

        while (data != -1) {
            Node<Integer> currnode = new Node<Integer>(data);
            if (head == null) {
                head = currnode;
                tail = currnode;
            } else {
                tail.next = currnode;
                tail = currnode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printrec(Node<Integer> head) {
        if (head == null) {
            return;
        }
        printrec(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Node<Integer> head = Input();
        printrec(head);
    }
}
