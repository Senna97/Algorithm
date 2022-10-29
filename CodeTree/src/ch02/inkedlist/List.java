package ch02.inkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String command = sc.nextLine();

            if (command.contains("push_front")) {
                String[] str = command.split(" ");
                linkedList.addFirst(Integer.valueOf(str[1]));
            } else if (command.contains("push_back")) {
                String[] str = command.split(" ");
                linkedList.addLast(Integer.valueOf(str[1]));
            } else if (command.equals("pop_front")) {
                System.out.println(linkedList.pollFirst());
            } else if (command.equals("pop_back")) {
                System.out.println(linkedList.pollLast());
            } else if (command.equals("size")) {
                System.out.println(linkedList.size());
            } else if (command.equals("empty")) {
                if (linkedList.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("front")) {
                System.out.println(linkedList.peekFirst());
            } else if (command.equals("back")) {
                System.out.println(linkedList.peekLast());
            }
        }
    }
}
