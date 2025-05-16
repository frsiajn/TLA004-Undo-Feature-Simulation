package com.mycompany.undofeature;

import java.util.Stack;
import java.util.Scanner;

public class UndoFeature {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        boolean action = true;
        System.out.println("Enter an action (type 'undo' to undo, 'exit' to stop)");

        while (action) {
            System.out.println("Action: ");
            String word = scan.nextLine().trim();

            if (word.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye!");
                action = false;
            } else if (word.equalsIgnoreCase("undo")) {
                if (stack.isEmpty()) {
                    System.out.println("No action in the stack.");
                } else {
                    String undoAction = stack.pop();
                    System.out.println("You undid " + undoAction);
                }
            } else {
                stack.push(word);
                System.out.println("You " + stack);
            }

        }

    }
}
