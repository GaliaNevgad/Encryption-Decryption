package com.company;

import java.io.FilterReader;
import java.io.IOException;

public class Reader extends FilterReader {
    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
    protected Reader(java.io.Reader in) {
        super(in);
    }

    public int readFrom(char keyCharacter) throws IOException {
        return super.read() - (int)keyCharacter; //выводим нормальное значение
    }
}
