package com.btc.xml.beans.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class ArchiveUtil {

    public static File escrever(String name, byte[] contents) throws IOException {
        File file = new File(name);
        
        OutputStream out = new FileOutputStream(file);
        out.write(contents);
        out.close();

        return file;
    }

    public static List<File> listar() {
        File dir = diretorioRaizParaArquivos();

        return Arrays.asList(dir.listFiles());
    }

    public static java.io.File diretorioRaizParaArquivos() {
        File dir = new File(diretorioRaiz(), "files");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        return dir;
    }
    
    public static String diretorioRaiz() {
        
    	File dir = new File("C:\\cbcxml\\files");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        return dir.getPath();
    }
}