import java.util.Scanner;
public class ReverseRoptimised5 {

    public static Node<Integer> input(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head=null , tail=null;
        while(data!=-1){
            Node<Integer> newnode = new Node<Integer>(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
            data=s.nextInt();
        }
        return head;
    }

        public static Node<Integer> reverseRBest(Node<Integer> head){
            if(head==null || head.next==null){
                return head;
            }
            Node<Integer> smallhead=reverseRBest(head.next);
            Node<Integer> smalltail=head.next;
            smalltail.next=head;
            head.next=null;
            return smallhead;
        }

        public static void printR(Node<Integer>head){
            if(head==null){
                return;
            }
            System.out.print(head.data+" ");
            printR(head.next);
        }
    public static void main(String[] args) {
        Node<Integer> head = input();
        head = reverseRBest(head);
        printR(head);
    }
}
