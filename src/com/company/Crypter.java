package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Crypter {
    //зашивровка
    public void Encryption(String text, File file, char keyCharacter){
        try(Writer writer = new Writer(new FileWriter(file))){
            for(char a : text.toCharArray()){
                writer.toWrite(a, keyCharacter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //расшифровка
    public String Description(File file, char keyCharacter){
        StringBuilder stringBuilder = new StringBuilder();
        int a;

        try(Reader reader = new Reader(new FileReader(file))){
            a = reader.readFrom(keyCharacter);

            while(a + (int)keyCharacter != -1){
                stringBuilder.append((char)a);
                a = reader.readFrom(keyCharacter);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
