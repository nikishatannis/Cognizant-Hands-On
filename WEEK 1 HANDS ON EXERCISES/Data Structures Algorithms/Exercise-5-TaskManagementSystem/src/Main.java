public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(101, "Design Module", "Pending"));
        list.addTask(new Task(102, "Develop Module", "In Progress"));
        list.addTask(new Task(103, "Testing", "Completed"));

        System.out.println("\nAll Tasks:");
        list.displayTasks();

        System.out.println("\nSearching Task 102:");

        Task task = list.searchTask(102);

        if (task != null) {
            System.out.println(task);
        }

        System.out.println("\nDeleting Task 101:");

        list.deleteTask(101);

        System.out.println("\nTasks After Deletion:");
        list.displayTasks();
    }
}