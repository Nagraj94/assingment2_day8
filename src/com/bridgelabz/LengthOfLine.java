package com.bridgelabz;

import java.util.Random;

public class LengthOfLine {


        public static void main(String[] args) {

            Random random = new Random();

            int x1 = random.nextInt(10);
            int y1 = random.nextInt(10);
            int x2 = random.nextInt(10);
            int y2 = random.nextInt(10);

            double length_of_a_line = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
            System.out.println(length_of_a_line);

        }

    }


