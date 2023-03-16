package Main;

import FileModifyFunction.FileFunction;
import Interface.UserInterface;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        UserInterface UI = new UserInterface();

        //File name Input
        Scanner sscanner = new Scanner(System.in);
        Scanner nscanner = new Scanner(System.in);

        int i = 0;
        String fileName;

        while (i!=10) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6) {
                UI.actionSelectionInterface1();
                i = nscanner.nextInt();
            }
            else {
                UI.actionSelectionInterface2();
                i = nscanner.nextInt();
            }

            switch (i) {
                case 1 -> {
                    System.out.println("Listing available files: ");
                    FileFunction FF = new FileFunction();
                    FF.fileRecordReading();
                }//case 1 - END

                case 2 -> {
                    System.out.print("Enter the File Name u want to add [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    FileFunction FF = new FileFunction();
                    FF.fileWriting(fileName);
                    FF.fileRecording(fileName);
                }//case 2 - END

                case 3 -> {
                    System.out.print("Enter the File name to be read [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    FileFunction FF = new FileFunction();
                    FF.fileReading(fileName);
                }//case 3 - END

                case 4 -> {
                    System.out.println("File Renaming ");
                    System.out.print("Please enter the name of the file u wish to change [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    System.out.print("Please enter the new name for the file u wish to change [xxx.txt]: ");
                    String newFileName = sscanner.nextLine();
                    FileFunction FF = new FileFunction();
                    FF.fileNameChanging(fileName, newFileName);
                    FF.fileRecordChanger(fileName, newFileName);
                }//case 4 -END

                case 5 ->
                    System.out.println("The system will now display the TimeTable related interface.");

                case 6 ->
                    System.out.println("The system will now display the Files related interface.");

                case 7 -> {
                    System.out.print("Enter the File Name u want to add the subject to [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    String subjectName;
                    System.out.print("Please Enter The Number Of The Subjects: ");
                    int subjectNumber = nscanner.nextInt();
                    System.out.println("Please Enter The Name Of The Subjects: ");
                    FileFunction FF = new FileFunction();
                    for (int j = 0; j < subjectNumber; j++) {
                        subjectName = sscanner.nextLine();
                        FF.fileAppending(fileName, subjectName);
                    }//for loop - END
                }//case 7 - END

                case 8 -> {
                    System.out.print("Enter the File Name u want to add the subject to [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    System.out.println("Please fill in the file table as the format below: ");
                    UI.timeTableFormat();
                    FileFunction FF = new FileFunction();
                    for (int j = 0; j <= 5; j++) {
                        String data = sscanner.nextLine();
                        FF.fileAppending(fileName, data);
                    }//for loop
                }//case 8 - END

                case 9 -> {
                    System.out.print("Enter the File Name u want to add the subject to [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    System.out.print("Please Enter the day of the TimeTable you will like to change: ");
                    String days = sscanner.nextLine();
                    System.out.println("Please Enter the changes you will like to make: ");
                    UI.timeTableSingleDayFormat();
                    String data = sscanner.nextLine();
                    FileFunction FF = new FileFunction();
                    FF.timeTableContentChanging(fileName, days, data);
                }

            }//switch case

        }//while loop
    }//main
}//Main