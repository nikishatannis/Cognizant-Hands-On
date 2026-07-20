public class TaskLinkedList {

    Task head = null;

    // Add Task
    public void addTask(Task newTask) {

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task added successfully.");
    }

    // Search Task
    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Display Tasks
    public void displayTasks() {

        Task temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }
}