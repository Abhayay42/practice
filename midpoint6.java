import java.util.Scanner;
public class midpoint6 {

    public static Node<Integer> input(){
        Scanner s = new Scanner(System.in);
        int data= s.nextInt();
        Node<Integer> head=null,tail=null;
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
    //done

    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> mid = midpoint(head);
        System.out.println(mid.data);
    }
}
