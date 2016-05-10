package de.maximilian;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blatt_6_3 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String"+ "\n");
        String s = br.readLine();
        System.out.print(s.toUpperCase());
    }
}