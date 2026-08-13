package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- 비밀 메모장 ----");
        System.out.println("1. 암호 저장");
        System.out.println("2. 암호 보기");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            saveSecret(sc);
        } else if(choice.equals("2")) {
            printSecret();
        }

        sc.close();
    } // end of main

    private static void printSecret() {
        try (FileInputStream fis = new FileInputStream("assets/secret.txt")) {
            int data;
            while ( (data = fis.read()) != -1 ){
                System.out.print( (char) (data -3) );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveSecret(Scanner sc) {

        System.out.print("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream("assets/secret.txt")) {
            byte[] original = input.getBytes();
            byte[] encrypted = new byte[original.length];

            for (int i = 0; i < original.length; i++) {
                encrypted[i] = (byte)(original[i] + 3);
            }
            fos.write(encrypted);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} // end oc class
