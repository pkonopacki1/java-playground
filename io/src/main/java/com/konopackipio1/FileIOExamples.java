package com.konopackipio1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileIOExamples {

    public static void main(String[] args) {
        try {
            writeRandomNumbers("randomNumbers.txt", 10, 100);
            System.out.println("Randoms number sum: " + readRandomNumbersSum("randomNumbers.txt"));

            writeRandomNumbersDataStream("randomNumbersDataStream.bin", 10, 100);
            System.out.println("Random numbers from data streamsum: " + readRandomNumbersSumDataStream("randomNumbersDataStream.bin"));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO exception occurred: " + e);
        }
        
    }
 
    
    static public void writeRandomNumbers(String fileName, int amount, int max) throws IOException {
        try(FileWriter fOutputStream = new FileWriter(fileName)) {
            fOutputStream.write(getRandomNumbersString(amount, max));
        }
    }

    static public int readRandomNumbersSum(String fileName) throws IOException {

        int sum = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
        }

        return sum;
    }

    static public void writeRandomNumbersDataStream(String fileName, int amount, int max) throws IOException {

        try(DataOutputStream dataOutputStream = new DataOutputStream(
            new BufferedOutputStream(
                new FileOutputStream(fileName)
            )
        )) {
            Random r = new Random();
            Stream
                .generate(() -> r.nextInt(max))
                .limit(amount)
                .forEach(t -> {
                    try {
                        dataOutputStream.writeInt(t);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });                  
        }
    }

    static public int readRandomNumbersSumDataStream(String fileName) throws IOException {

        int sum = 0;

        try(DataInputStream dataInputStream = new DataInputStream(
            new BufferedInputStream(
                new FileInputStream(fileName)
            )
        )) {
            try {
                while(true) {
                    sum += dataInputStream.readInt();
                }
            } catch (EOFException e) {
                return sum;
            }       
        }
    }


    private static String getRandomNumbersString(int amount, int max) {
        Random r = new Random();

        return Stream
            .generate(() -> r.nextInt(max))
            .limit(amount)
            .map(i -> new String(i + "\n"))
            .collect(Collectors.joining());
    }
}
