package com.company;

import org.junit.Test;

import java.io.File;

public class CrypterTest {

    @Test
    public void testEncryption(){
        String ex = "Naruto";
        Crypter crypter = new Crypter();
        File file = new File("/Users/koshelbogdan/Desktop/IO/crypt.txt");
        crypter.Encryption(ex, file, '1');
        System.out.println(crypter.Description(file, '1'));
    }
}