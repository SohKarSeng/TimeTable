package FileModifyFunction;

import java.io.*;

public class FileFunction {

    public void fileWriting(String fileName){
        //for case 1
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("TimeTable");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }

    public void fileRecording(String fileName){
        //for case 1
        try (PrintWriter pw = new PrintWriter(new FileWriter("FileRecord.txt", true))) {
            pw.println(fileName);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }

    public void fileRecordReading() {
        try (BufferedReader br = new BufferedReader(new FileReader("FileRecord.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No Files are available");
            System.err.format("IOException: %s%n", e);
        }//Exception
    }

    public void fileReading(String fileName){
        //for case 2
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }

    public void fileAppending(String fileName, String subjectName){
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            pw.println(subjectName);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }//Exception
    }

    public void fileNameChanging(String fileName, String newFileName){
        // Create a File object for the original file
        File oldFile = new File(fileName);

        // Create a File object for the new file name
        File newFile = new File(newFileName);

        // Rename the file
        boolean success = oldFile.renameTo(newFile);

        if (success) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("File rename failed.");
        }
    }

    public void fileRecordChanger(String nameOfTheFile, String newFileName) {
        int lineNumToChange = 0;
        try {
            // Read the contents of the file into a string array
            BufferedReader br = new BufferedReader(new FileReader("FileRecord.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("FileRecord.txt"));
            String oldLine;
            while ((oldLine = br.readLine()) != null) {
                if (!(oldLine.equals(nameOfTheFile))) {
                    lineNumToChange++;
                }
            }
            String[] lines = br2.lines().toArray(String[]::new);
            br2.close();

            // Change the specified line with the new text
            lines[lineNumToChange] = newFileName;

            // Write the modified contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("FileRecord.txt"));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();

            System.out.println("Line " + lineNumToChange + " changed successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /*public void timeTableContentChanging(String fileName, String days, String data){
        int lineNumToChange = 0;
        try {
            // Read the contents of the file into a string array
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            BufferedReader br2 = new BufferedReader(new FileReader(fileName));
            String oldLine;
            while ((oldLine = br.readLine()) != null) {
                if ((oldLine.contains(days))) {
                    break;
                }
                else
                    lineNumToChange++;
            }
            String[] lines = br2.lines().toArray(String[]::new);
            br2.close();

            // Change the specified line with the new text
            lines[lineNumToChange] = data;

            // Write the modified contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();

            System.out.println("Line " + lineNumToChange + " changed successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }*/
}
