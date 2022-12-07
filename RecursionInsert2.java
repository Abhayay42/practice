import java.util.Scanner;
public class RecursionInsert2 {

    public static Node<Integer> Input(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head =null , tail =null;
        int data = s.nextInt();

        while(data!=-1){
            Node<Integer> newnode  = new Node<Integer>(data);
            if(head==null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node<Integer> InsertR(Node<Integer> head , int elem , int pos){
        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newnode = new Node<Integer> (elem);
            newnode.next=head;
            return newnode;
        }
        else{
            head.next=InsertR(head.next,elem,pos-1);
            return head;
        }

    }

    public static void print(Node<Integer> head){
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head=Input();
        head = InsertR(head,20,6);
        print(head);
    }
}
