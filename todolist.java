import java.util.ArrayList;
import java.util.Scanner;
public class todolist {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner vm = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("0. Exit");
            System.out.println("Enter choice:");
            choice = vm.nextInt();
            vm.nextLine();
            switch (choice) {
                case 1:
                       System.out.println("enter task:");
                       tasks.add(vm.nextLine());
                       System.out.println("Task added!");
                    break;
                case 2:
                       System.out.println("\nYour To-Do List:");
                       for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+"."+tasks.get(i));
                       }
                    break;
                case 3:
                       System.out.println("Enter task number to remove:");
                       int tasknum = vm.nextInt();
                       if(tasknum>0 && tasknum<=tasks.size()){
                        tasks.remove(tasknum-1);
                        System.out.println("Task removed!");
                       }else{
                        System.out.println("Invalid task number.");
                       }
                    break;
                   case 0:
                         System.out.println("Exiting...");
                         break;
            
                default:
                        System.out.println("Invalid choice. Try again.");
                    break;
            }


        }while (choice!=0);
         
        vm.close();
            
        }

    }
    
