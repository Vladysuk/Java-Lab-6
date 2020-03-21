package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.iot.RegEx.*;

class MyScannerTest {



    @Test
    public void testDeleteFromTextSecond() {

        String letter = "o";
        InputStream inputStreamForLetter = new ByteArrayInputStream(letter.getBytes());
        Scanner scannerForLetter = new Scanner(inputStreamForLetter);

        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        InputStream inputStreamForLine = new ByteArrayInputStream(line.getBytes());
        Scanner scannerForLine = new Scanner(inputStreamForLine);

        deleteTextUsingPatterns(scannerForLetter.nextLine(), scannerForLine.nextLine());
    }

}