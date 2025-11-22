package homeworks.fileAnalayzer;

import java.io.IOException;

public class FileAnalyzerMain {
    public static void main(String[] args) {
        FileAnalayzer fileAnalayzer = new FileAnalayzer();
        String filePath = "C://Users//user//IdeaProjects//JavaCore//src//homeworks//fileAnalayzer//LoremIpsum.txt";

        try {
            System.out.println("Word Map: " + fileAnalayzer.wordMap(filePath));
            System.out.println("Total Word Count: " + fileAnalayzer.totalWordCount(filePath));
            System.out.println("Unique Word Count: " + fileAnalayzer.uniqueWordCount(filePath));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}