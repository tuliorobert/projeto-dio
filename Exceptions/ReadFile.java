package Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ReadFile {
    public static void printFile(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush();
        br.close();
    }

    public static void main(String[] args) {
        String fileName = "MyText.txt";
        try {
            printFile(fileName);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o arquivo que deseja imprimir!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!");

            e.printStackTrace();
        }
    }
}