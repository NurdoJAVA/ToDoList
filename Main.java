import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<String>();
        int func1;
        int func;
        String newTask;

        while (true)
        {
            System.out.println("\n--TASK--");
            System.out.println("1) Menu");
            System.out.println("2) EXIT");

            func1 = scan.nextInt();

            if (func1 == 1){
                System.out.println("\nChoose an Option");
                System.out.println("1) ADD");
                System.out.println("2) EDIT");
                System.out.println("3) DELETE");
                System.out.println("4) SHOW");
                System.out.println("0) EXIT");
            } else if (func1 == 2) {
                System.out.println("EXIT");
                break;
            }

            func = scan.nextInt();

            if (func == 1) {
                String task ="";
                while (!task.equalsIgnoreCase("done")) {
                    System.out.println("Add a new task. Enter \"done\" to finish.");

                    task = scan2.nextLine();
                    if(task.equalsIgnoreCase("done")){
                        continue;
                    }else{
                        tasks.add(task);
                    }

                }
            }
            else if (func==2) {
                System.out.println("Choose the Task to EDIT");
                int index = scan2.nextInt()-1;
                System.out.println("Write your new TASK here");
                scan.nextLine();
                newTask = scan2.nextLine();
                tasks.set(index,newTask);
            }
            else if (func==3) {
                System.out.println("Choose the Task to DELETE");
                int index = scan2.nextInt()-1;
                tasks.remove(index);
            }
            else if (func==4) {
                for(int i = 0; i< tasks.size();i++)
                {
                    System.out.println(i+1 + ") " + tasks.get(i));
                }
            }
            else if (func == 0) {
                System.out.println("EXIT");
                break;
            }
            else {
                System.out.println("ERROR");
            }
        }
    }
}