package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {


        //File name Input
        Scanner sscanner = new Scanner(System.in);
        Scanner nscanner = new Scanner(System.in);

        int i = 0;
        String fileName = null;

        while (i!=9) {
            System.out.println("Enter the action number you will like to perform [x]: ");
            System.out.println("[1] - Create a new TimeTable");
            System.out.println("[2] - Read a TimeTable");
            System.out.println("[3] - Adding subject to the TimeTable");
            System.out.println("[4] - Not Implemented");
            System.out.println("[9] - Exit Program");
            i = nscanner.nextInt();

            switch (i) {
                case 1 -> {
                    System.out.print("Enter the File Name u want to add [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                        pw.println("TimeTable(New)");
                    } catch (IOException e) {
                        System.err.format("IOException: %s%n", e);
                    }//Exception
                }//case 1 - END
                case 2 -> {
                    System.out.println("Enter the File name to be read [xxx.txt]: ");
                    fileName = sscanner.nextLine();
                    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.err.format("IOException: %s%n", e);
                    }//Exception
                }//case 2 - END
                case 3 -> {
                    if (fileName != null) {
                        String subjectName;
                        System.out.println("Please Enter The Number Of The Subjects");
                        int subjectNumber = nscanner.nextInt();
                        System.out.println("Please Enter The Name Of The Subjects");
                        for (int j = 0; j < subjectNumber; j++) {
                            subjectName = sscanner.nextLine();
                            try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
                                pw.println(subjectName);
                            } catch (IOException e) {
                                System.err.format("IOException: %s%n", e);
                            }//Exception
                        }//subjectNumber Loop
                    }//if - END
                }//case 3 - END
            }//switch case

        }//while loop
    }//main
}//Main