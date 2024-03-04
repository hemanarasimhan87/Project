package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator test = new Calculator();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        String result;
        String age;
        do {
            System.out.println("Enter your age: ");
            age = scanner.nextLine();
            result = test.getYearOfBirth(name, age);
            System.out.println(result);
        } while (result.equals("Invalid age"));
    }

    public String getYearOfBirth(String name, String age) {
        try {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int birthYear = currentYear - Integer.parseInt(age);
            int ageCheck =Integer.parseInt(age);
            if ((int) ageCheck >= 0) {
                return greetings(name, String.valueOf(birthYear), Integer.parseInt(age));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error Occurred.");
        }
        return "Invalid age";
    }


    public String greetings(String name, String birthYear, int age) {
        if (age >= 0) {
                return ("Hi " + name + "," + " your year of birth is " + birthYear + ".");
            }
        return "Invalid error";
    }
    }
