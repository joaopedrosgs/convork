package t3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaidaParser {

    private StringBuffer err_buffer;
    private StringBuffer code_buffer;
    private boolean has_error;

    public SaidaParser() {
        err_buffer = new StringBuffer();
        code_buffer = new StringBuffer();
        has_error = false;
    }

    public void println(String msg) {
        if(!has_error) has_error = true;
        err_buffer.append(msg);
        err_buffer.append("\n");
    }

    public void printCode(String code) {
        code_buffer.append(code);
    }

    public void print(String texto) {
        if(!has_error) has_error = true;
        err_buffer.append(texto);
    }

    public boolean HasError() {
        return has_error;
    }

    @Override
    public String toString() {
        return has_error ? err_buffer.toString() : code_buffer.toString();
    }

    public void reset() {
        err_buffer.setLength(0);
        has_error = false;
    }
    public void WriteToFile(String fileName) {
        String out = toString();
        System.out.println(out);
        try {
            File fd = new File(fileName);
            fd.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(fd));
            pw.println(out);
            pw.close();
        } catch (IOException e) {
            System.out.println("Falha ao abrir o arquivo de saida");
        }
    }
}