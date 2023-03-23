package FileModifyFunction;

import TimeTable.Timetable;

import java.io.*;

public class TimetableFileWriting extends Timetable{

    public void timeTableFileAdding(String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
        String line;
        int modified = 0;
        while ((line = br.readLine()) != null) {
            if ((line.equals("Time \\ date   |9      |10     |11     |12     |13     |14     |15     |16     |17     |"))) {
                timeTableFileRewriting(fileName);
                modified = 1;
                System.out.println("Readjusted");
            }
        }
        if (modified == 0) {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            pw.println("Time \\ date   |9      |10     |11     |12     |13     |14     |15     |16     |17     |");
            //Monday
            pw.println("Monday        |  " + printTimeTable(0, 0) + "  |  " + printTimeTable(0, 1)
                    + "  |  " + printTimeTable(0, 2) + "  |  " + printTimeTable(0, 3)
                    + "  |=======|  " + printTimeTable(0, 5) + "  |  " + printTimeTable(0, 6)
                    + "  |  " + printTimeTable(0, 7) + "  |  " + printTimeTable(0, 8)
                    + "  |"
            );
            //Tuesday
            pw.println("Tuesday       |  " + printTimeTable(1, 0) + "  |  " + printTimeTable(1, 1)
                    + "  |  " + printTimeTable(1, 2) + "  |  " + printTimeTable(1, 3)
                    + "  |=======|  " + printTimeTable(1, 5) + "  |  " + printTimeTable(1, 6)
                    + "  |  " + printTimeTable(1, 7) + "  |  " + printTimeTable(1, 8)
                    + "  |"
            );
            //Wednesday
            pw.println("Wednesday     |  " + printTimeTable(2, 0) + "  |  " + printTimeTable(2, 1)
                    + "  |  " + printTimeTable(2, 2) + "  |  " + printTimeTable(2, 3)
                    + "  |=======|  " + printTimeTable(2, 5) + "  |  " + printTimeTable(2, 6)
                    + "  |  " + printTimeTable(2, 7) + "  |  " + printTimeTable(2, 8)
                    + "  |"
            );
            //Thursday
            pw.println("Thursday      |  " + printTimeTable(3, 0) + "  |  " + printTimeTable(3, 1)
                    + "  |  " + printTimeTable(3, 2) + "  |  " + printTimeTable(3, 3)
                    + "  |=======|  " + printTimeTable(3, 5) + "  |  " + printTimeTable(3, 6)
                    + "  |  " + printTimeTable(3, 7) + "  |  " + printTimeTable(3, 8)
                    + "  |"
            );
            //Friday
            pw.println("Friday        |  " + printTimeTable(4, 0) + "  |  " + printTimeTable(4, 1)
                    + "  |  " + printTimeTable(4, 2) + "  |  " + printTimeTable(4, 3)
                    + "  |=======|  " + printTimeTable(4, 5) + "  |  " + printTimeTable(4, 6)
                    + "  |  " + printTimeTable(4, 7) + "  |  " + printTimeTable(4, 8)
                    + "  |"
            );
            pw.close();
            System.out.println("New table created");
        }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }



    public void timeTableFileRewriting(String fileName ){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                if ((line.equals("Time \\ date   |9      |10     |11     |12     |13     |14     |15     |16     |17     |"))) {
                    PrintWriter pw = new PrintWriter(new FileWriter(fileName));
                    pw.println("Time \\ date   |9      |10     |11     |12     |13     |14     |15     |16     |17     |");
                    //Monday
                    pw.println("Monday        |  " + printTimeTable(0, 0) + "  |  " + printTimeTable(0, 1)
                            + "  |  " + printTimeTable(0, 2) + "  |  " + printTimeTable(0, 3)
                            + "  |=======|  " + printTimeTable(0, 5) + "  |  " + printTimeTable(0, 6)
                            + "  |  " + printTimeTable(0, 7) + "  |  " + printTimeTable(0, 8)
                            + "  |"
                    );
                    //Tuesday
                    pw.println("Tuesday       |  " + printTimeTable(1, 0) + "  |  " + printTimeTable(1, 1)
                            + "  |  " + printTimeTable(1, 2) + "  |  " + printTimeTable(1, 3)
                            + "  |=======|  " + printTimeTable(1, 5) + "  |  " + printTimeTable(1, 6)
                            + "  |  " + printTimeTable(1, 7) + "  |  " + printTimeTable(1, 8)
                            + "  |"
                    );
                    //Wednesday
                    pw.println("Wednesday     |  " + printTimeTable(2, 0) + "  |  " + printTimeTable(2, 1)
                            + "  |  " + printTimeTable(2, 2) + "  |  " + printTimeTable(2, 3)
                            + "  |=======|  " + printTimeTable(2, 5) + "  |  " + printTimeTable(2, 6)
                            + "  |  " + printTimeTable(2, 7) + "  |  " + printTimeTable(2, 8)
                            + "  |"
                    );
                    //Thursday
                    pw.println("Thursday      |  " + printTimeTable(3, 0) + "  |  " + printTimeTable(3, 1)
                            + "  |  " + printTimeTable(3, 2) + "  |  " + printTimeTable(3, 3)
                            + "  |=======|  " + printTimeTable(3, 5) + "  |  " + printTimeTable(3, 6)
                            + "  |  " + printTimeTable(3, 7) + "  |  " + printTimeTable(3, 8)
                            + "  |"
                    );
                    //Friday
                    pw.println("Friday        |  " + printTimeTable(4, 0) + "  |  " + printTimeTable(4, 1)
                            + "  |  " + printTimeTable(4, 2) + "  |  " + printTimeTable(4, 3)
                            + "  |=======|  " + printTimeTable(4, 5) + "  |  " + printTimeTable(4, 6)
                            + "  |  " + printTimeTable(4, 7) + "  |  " + printTimeTable(4, 8)
                            + "  |"
                    );
                    pw.close();
                }
            }
        } catch (IOException e) {

            System.err.format("IOException: %s%n", e);
        }//Exception
    }


    public void timeTableFileAddingSingleLine(String days, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int stringFound = 0;
            String targetedLine = null;
            String modifiedLine = null;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
                if (line.contains(days)){
                    stringFound = 1;
                    targetedLine = line;
                }
            }
            if (stringFound != 1) {
                System.out.println("Invalid operation, selected days are not found.");
            }
            switch(days) {
                case "Monday" ->
                    modifiedLine = "Monday        |  " + printTimeTable(0, 0) + "  |  " + printTimeTable(0, 1)
                            + "  |  " + printTimeTable(0, 2) + "  |  " + printTimeTable(0, 3)
                            + "  |=======|  " + printTimeTable(0, 5) + "  |  " + printTimeTable(0, 6)
                            + "  |  " + printTimeTable(0, 7) + "  |  " + printTimeTable(0, 8)
                            + "  |"
                    ;


                case "Tuesday" ->
                    modifiedLine = "Tuesday       |  " + printTimeTable(1, 0) + "  |  " + printTimeTable(1, 1)
                            + "  |  " + printTimeTable(1, 2) + "  |  " + printTimeTable(1, 3)
                            + "  |=======|  " + printTimeTable(1, 5) + "  |  " + printTimeTable(1, 6)
                            + "  |  " + printTimeTable(1, 7) + "  |  " + printTimeTable(1, 8)
                            + "  |"
                    ;


                case "Wednesday" ->
                    modifiedLine = "Wednesday     |  " + printTimeTable(2, 0) + "  |  " + printTimeTable(2, 1)
                            + "  |  " + printTimeTable(2, 2) + "  |  " + printTimeTable(2, 3)
                            + "  |=======|  " + printTimeTable(2, 5) + "  |  " + printTimeTable(2, 6)
                            + "  |  " + printTimeTable(2, 7) + "  |  " + printTimeTable(2, 8)
                            + "  |"
                            ;


                case "Thursday" ->
                    modifiedLine = "Thursday      |  " + printTimeTable(3, 0) + "  |  " + printTimeTable(3, 1)
                            + "  |  " + printTimeTable(3, 2) + "  |  " + printTimeTable(3, 3)
                            + "  |=======|  " + printTimeTable(3, 5) + "  |  " + printTimeTable(3, 6)
                            + "  |  " + printTimeTable(3, 7) + "  |  " + printTimeTable(3, 8)
                            + "  |"
                            ;


                case "Friday" ->
                    modifiedLine = "Friday        |  " + printTimeTable(4, 0) + "  |  " + printTimeTable(4, 1)
                            + "  |  " + printTimeTable(4, 2) + "  |  " + printTimeTable(4, 3)
                            + "  |=======|  " + printTimeTable(4, 5) + "  |  " + printTimeTable(4, 6)
                            + "  |  " + printTimeTable(4, 7) + "  |  " + printTimeTable(4, 8)
                            + "  |"
                            ;



            }//switch - End
            if(targetedLine != null && modifiedLine != null) {
                modifiedLine = content.toString().replace(targetedLine, modifiedLine);
                FileWriter writer = new FileWriter(fileName);
                writer.write(modifiedLine);
                writer.close();
            }
            else
                System.out.println("Writing Error.");

            System.out.println("File has been modified successfully.");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }
}