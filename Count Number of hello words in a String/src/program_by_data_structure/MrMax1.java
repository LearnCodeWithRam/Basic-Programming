package program_by_data_structure;

import java.util.Scanner;

public class MrMax1 {

	public static void main(String[] args) {
		double basic,da,hra,gross;
		System.out.println("Enter Basic salary of the employee\n");
		Scanner obj1=new Scanner(System.in);
		basic=obj1.nextDouble();
		if(basic<(1500.00))
		{
		da=90*basic/100;
		hra=10*basic/100;
		gross= basic+da+hra;
		System.out.println("The D.A of the basic salary of the employee is:" +da);
		System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
		System.out.println("The Gross salary of the employee is:" +gross);
		}
		else
		{
			da=98*basic/100;
			hra=500;
			gross= basic+da+hra;
			System.out.println("The D.A of the basic salary of the employee is:" +da);
			System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
			System.out.println("The Gross salary of the employee is:" +gross);	
		}

	}

}
/** import java.util.*;
 
class Node {
    int data;
    Node next;
 
    Node(int d)
    {
        data = d;
        next = null;
    }
}
 
class LinkedList {
    Node head;
 
    LinkedList() { head = null; }
 
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
 
class AddTwoLists {
    public static void main(String[] args)
    {
        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();
        first.push(6);
        first.push(4);
        first.push(9);
        first.push(5);
        first.push(7);
 
        second.push(4);
        second.push(8);
 
        LinkedList ans = addTwoLists(first, second);
 
        System.out.print("Sum is : ");
        ans.printList();
    }
 
    static LinkedList addTwoLists(LinkedList first,
                                  LinkedList second)
    {
        int num1 = 0, num2 = 0;
        while (first.head != null) {
            num1 = num1 * 10 + first.head.data;
            first.head = first.head.next;
        }
        while (second.head != null) {
            num2 = num2 * 10 + second.head.data;
            second.head = second.head.next;
        }
        int num3 = num1 + num2;
        LinkedList temp = new LinkedList();
        while (num3 != 0) {
            int last = num3 % 10;
            temp.push(last);
            num3 = num3 / 10;
        }
        return temp;
    }
}*/