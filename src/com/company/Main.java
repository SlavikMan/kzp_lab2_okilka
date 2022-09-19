package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException
    {
        int nRows;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter size of array: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++)
        {
            arr[i]= new char[nRows/2];
        }

        System.out.print("\nEnter char: ");
        filler = in.nextLine();
        int empty = nRows/6;
        exit:
        for(int i = 0; i < nRows; i++)
        {
            for(int j = 0; j < nRows/2; j++) {
                if (filler.length() == 1) {
                    if(empty==nRows/6)
                    {
                        for(int k = 0; k < nRows/6; k++) {
                            System.out.print("  ");
                            fout.print("  ");
                        }
                        empty=0;
                    }

                    arr[i][j] = (char) filler.codePointAt(0);

                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                    empty++;
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
