package TestClassesOPD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Bidhu Dash
 * @Date 12-05-2025
 *
 * Problem Statement: You are tasked with developing a program to manage a list of student grades. The program should allow the user to:
 * Add new grades to the list.
 * Calculate the average grade.
 * Find the highest and lowest grades.
 * Display all grades.
 * Exit the program.
 *
 * Requirements:
 * Use a for loop to iterate through the list of grades when calculating the average, highest, and lowest grades.
 * Use a while loop to continuously prompt the user for actions until they choose to exit the program.
 *
 * Ensure that the program handles edge cases, such as an empty list when calculating the average, highest, and lowest grades.
 *
 * Sample Input:
 * addGrade(85);addGrade(90);addGrade(78);calculateAverage();findHighestGrade();findLowestGrade();displayGrades();exit();
 * Sample Output:
 * Grade added: 85Grade added: 90Grade
 */
public class Test4 {

    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Grade");
            System.out.println("2. Calculate Average");
            System.out.println("3. Find Highest Grade");
            System.out.println("4. Find Lowest Grade");
            System.out.println("5. Display All Grades");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter grade to add: ");
                    int grade = scanner.nextInt();
                    grades.add(grade);
                    System.out.println("Grade added: " + grade);
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("Grade list is empty. Cannot calculate average.");
                    } else {
                        int sum = 0;
                        for (int g : grades) {
                            sum += g;
                        }
                        double average = (double) sum / grades.size();
                        System.out.println("Average grade: " + average);
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("Grade list is empty. Cannot find highest grade.");
                    } else {
                        int highest = grades.get(0);
                        for (int g : grades) {
                            if (g > highest) highest = g;
                        }
                        System.out.println("Highest grade: " + highest);
                    }
                    break;

                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("Grade list is empty. Cannot find lowest grade.");
                    } else {
                        int lowest = grades.get(0);
                        for (int g : grades) {
                            if (g < lowest) lowest = g;
                        }
                        System.out.println("Lowest grade: " + lowest);
                    }
                    break;

                case 5:
                    if (grades.isEmpty()) {
                        System.out.println("No grades to display.");
                    } else {
                        System.out.println("All grades:");
                        for (int g : grades) {
                            System.out.print(g + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 6.");
            }

        }
    }
}