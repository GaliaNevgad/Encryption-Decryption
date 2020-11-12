package com.company;

import java.io.FilterWriter;
import java.io.IOException;

public class Writer extends FilterWriter {
    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
    protected Writer(java.io.Writer out) {
        super(out);
    }

    public void toWrite(int a, char keyCharacter) throws IOException {
        super.write(a + (int)keyCharacter); //(int)key - преобразование key в тип данных int
        //записываем значение код которого больше на значение кода ключевого символа
    }
}
