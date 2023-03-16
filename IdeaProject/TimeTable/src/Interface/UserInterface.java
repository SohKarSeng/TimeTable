package Interface;

public class UserInterface {
    public void actionSelectionInterface1(){
        System.out.println("Enter the action number you will like to perform [x]: ");
        System.out.println("[1] - View all the Files");
        System.out.println("[2] - Create a new TimeTable");
        System.out.println("[3] - Read a TimeTable");
        System.out.println("[4] - File Rename");
        System.out.println("[5] - TimeTable Interface");
        System.out.println("[10] - Exit Program");
    }

    public void actionSelectionInterface2(){
        System.out.println("Enter the action number you will like to perform [x]: ");
        System.out.println("[6] - File Management Interface");
        System.out.println("[7] - TimeTable Subject Adding");
        System.out.println("[8] - TimeTable TimeSlot Adding");
        System.out.println("[9] - TimeTable Single TimeSlot Changes");
        System.out.println("[10] - Exit Program");
    }

    public void timeTableFormat(){
        System.out.println("Days/Time   |******09-11******|******11-13******|=====|******14-16******|******16-18******|");
        System.out.println("Monday      |        |        |        |        |=====|        |        |        |        |");
        System.out.println("Tuesday     |        |        |        |        |=====|        |        |        |        |");
        System.out.println("Wednesday   |        |        |        |        |=====|        |        |        |        |");
        System.out.println("Thursday    |        |        |        |        |=====|        |        |        |        |");
        System.out.println("Friday      |        |        |        |        |=====|        |        |        |        |");
    }

    public void timeTableSingleDayFormat(){
        System.out.println(" xxxDay     |        |        |        |        |=====|        |        |        |        |");
    }
}
