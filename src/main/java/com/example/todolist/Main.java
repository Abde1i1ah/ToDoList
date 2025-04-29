package com.example.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.print("Enter task number to complete: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        todoList.completeTask(index);
                        System.out.println("Task marked as completed.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    todoList.listTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}