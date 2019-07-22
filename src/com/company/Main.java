package com.company;

import java.util.Scanner;

public class Main {

    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        int column = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int row = scanner.nextInt();

        int[][] numbers = new int[column][row];

         for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }

        System.out.println("giá trị lớn nhất của mảng 2 chiều là: " + max);

    }
}
