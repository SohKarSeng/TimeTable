package TimeTable;

public class Timetable {

    public static String[][] table = new String[5][9];

    public void addSubjectToTimeTable(int day, int time, String subjectName){
        table[day-1][time-9] = subjectName;
    }

    public String printTimeTable(int day, int time){
        if (table[day][time]!=null) {
            return table[day][time];
        }
        else
            return table[day][time] = "   ";
    }

    public void timeTableFormat(){
        System.out.println("Time \\ date   |9      |10     |11     |12     |13     |14     |15     |16     |17     |");
        //Monday
        System.out.println("Monday        |  " + printTimeTable(0, 0) + "  |  " + printTimeTable(0, 1) + "  |  "
                + printTimeTable(0, 2) + "  |  " + printTimeTable(0, 3) + "  |=======|  " + printTimeTable(0, 5)
                + "  |  " + printTimeTable(0, 6) + "  |  " + printTimeTable(0, 7) + "  |  " + printTimeTable(0, 8)
                + "  |"
        );
        //Tuesday
        System.out.println("Tuesday       |  " + printTimeTable(1, 0) + "  |  " + printTimeTable(1, 1) + "  |  "
                + printTimeTable(1, 2) + "  |  " + printTimeTable(1, 3) + "  |=======|  " + printTimeTable(1, 5)
                + "  |  " + printTimeTable(1, 6) + "  |  " + printTimeTable(1, 7) + "  |  " + printTimeTable(1, 8)
                + "  |"
        );
        //Wednesday
        System.out.println("Wednesday     |  " + printTimeTable(2, 0) + "  |  " + printTimeTable(2, 1) + "  |  "
                + printTimeTable(2, 2) + "  |  " + printTimeTable(2, 3) + "  |=======|  " + printTimeTable(2, 5)
                + "  |  " + printTimeTable(2, 6) + "  |  " + printTimeTable(2, 7) + "  |  " + printTimeTable(2, 8)
                + "  |"
        );
        //Thursday
        System.out.println("Thursday      |  " + printTimeTable(3, 0) + "  |  " + printTimeTable(3, 1) + "  |  "
                + printTimeTable(3, 2) + "  |  " + printTimeTable(3, 3) + "  |=======|  " + printTimeTable(3, 5)
                + "  |  " + printTimeTable(3, 6) + "  |  " + printTimeTable(3, 7) + "  |  " + printTimeTable(3, 8)
                + "  |"
        );
        //Friday
        System.out.println("Friday        |  " + printTimeTable(4, 0) + "  |  " + printTimeTable(4, 1) + "  |  "
                + printTimeTable(4, 2) + "  |  " + printTimeTable(4, 3) + "  |=======|  " + printTimeTable(4, 5)
                + "  |  " + printTimeTable(4, 6) + "  |  " + printTimeTable(4, 7) + "  |  " + printTimeTable(4, 8)
                + "  |"
        );
    }
}
