import java.util.Scanner;
public class Merge2sortedLL7 {

    public static Node<Integer> input(){
        Scanner s = new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data =s.nextInt();
        while(data!=-1){
            Node<Integer> newnode= new Node<Integer>(data);
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

    public static Node<Integer> merge(Node<Integer>head1,Node<Integer>head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        Node<Integer> t1 = head1 , t2 = head2;
        Node<Integer> head = null , tail = null;

        if(t1.data<=t2.data){
            head = t1 ;
            tail = t1 ;
            t1 = t1.next;
        }
        else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else{
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }
        else{
            tail.next=t2;
        }
        return head;    

        }

        public static void print(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    public static void main(String[] args) {
        Node<Integer> head1 = input();
        Node<Integer> head2 = input();
        Node<Integer> head = merge(head1,head2);
        print(head);
    }
}
