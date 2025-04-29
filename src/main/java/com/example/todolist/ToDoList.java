package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}