package com.testing.tutorial;

import javax.swing.*;

//Determining Letter Grade
public class Grader {
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade can't determine");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';

        } else if (numberGrade < 80) {
            return 'C';

        } else if (numberGrade < 90) {
            return 'B';


        } else {
            return 'A';
        }

    }

}
