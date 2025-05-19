package org.hslu.a4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpeedTest {
    public static void main(String[] args) {
        String text = readFile("src/main/resources/shakespeare.txt");
        String pattern = "Thus merely with the garment of a Grace";

        // Java search
        int durationJava = measureTime(() -> text.indexOf(pattern));
        System.out.println("Java Search Time: " + durationJava + " ns");

        // KMP Algorithm
        int durationKMP = measureTime(() -> KMPAlgorithm.kmpSearch(text, pattern));
        System.out.println("KMP Algorithm Time: " + durationKMP + " ns");

        // Optimal Mismatch
        int durationOM = measureTime(() -> OptimalMismatch.optimalMismatch(text, pattern));
        System.out.println("Optimal Mismatch Time: " + durationOM + " ns");

        // Quick Search
        int durationQS = measureTime(() -> Quicksearch.quickSearch(text, pattern));
        System.out.println("Quick Search Time: " + (durationQS) + " ns");

        // Simple Search
        int duration = measureTime(() -> SimpleSearch.simpleSearch(text, pattern));
        System.out.println("Simple Search Time: " + (duration) + " ns");

        // Print out the results as table
        System.out.printf("%-20s %-20s %-20s\n", "Algorithm", "Time (ns)", "Pattern");
        System.out.printf("%-20s %-20d %-20s\n", "Java Search", durationJava, pattern);
        System.out.printf("%-20s %-20d %-20s\n", "KMP Algorithm", durationKMP, pattern);
        System.out.printf("%-20s %-20d %-20s\n", "Optimal Mismatch", durationOM, pattern);
        System.out.printf("%-20s %-20d %-20s\n", "Quick Search", durationQS, pattern);
        System.out.printf("%-20s %-20d %-20s\n", "Simple Search", duration, pattern);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-20d %-20s\n", "Text Length", text.length(), "");
        System.out.printf("%-20s %-20d %-20s\n", "Pattern Length", pattern.length(), "");
        System.out.println("-------------------------------------------------");
    }

    // read the text from a file
     public static String readFile(String filePath) {
         StringBuilder contentBuilder = new StringBuilder();
         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
             String line;
             while ((line = br.readLine()) != null) {
                 contentBuilder.append(line).append("\n");
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         return contentBuilder.toString();
     }

     private static int measureTime(Runnable fun) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            fun.run();
        }
        long endTime = System.nanoTime();
        return (int) (endTime - startTime)/10;
     }
}
