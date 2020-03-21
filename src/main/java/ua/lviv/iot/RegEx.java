package ua.lviv.iot;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    static String fixedText;

    public static void deleteTextUsingPatterns(final String patternString, String textToCheck) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(textToCheck);
        System.out.println("********* Regex output *********");
        fixedText = matcher.replaceAll("");
        System.out.println(fixedText);
    }

    public static String scanLetter() {
        System.out.println("Enter your letter:");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return "[" + scanner.nextLine() + "]";
    }

    public static String scanLine() {
        System.out.println("Enter your sentence:");
        @SuppressWarnings(value = "resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //            -----------------IN MAIN EVERYTHING WORK---------------------
    public static void main(String ... args) {
        deleteTextUsingPatterns(scanLetter(), scanLine());
    }

}