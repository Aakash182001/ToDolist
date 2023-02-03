import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> taskList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add task");
            System.out.println("2. Edit task");
            System.out.println("3. Delete task");
            System.out.println("4. View tasks");
            System.out.println("5. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    editTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    viewTasks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void addTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter task: ");
        String task = input.nextLine();
        taskList.add(task);
        System.out.println("Task added successfully.");
    }

    private static void editTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter task number: ");
        int taskNum = input.nextInt();
        if (taskNum > 0 && taskNum <= taskList.size()) {
            System.out.print("Enter new task: ");
            String task = input.nextLine();
            taskList.set(taskNum - 1, task);
            System.out.println("Task edited successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter task number: ");
        int taskNum = input.nextInt();
        if (taskNum > 0 && taskNum <= taskList.size()) {
            taskList.remove(taskNum - 1);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void viewTasks() {
        System.out.println("Tasks: ");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + ". " + taskList.get(i));
        }
    }
}