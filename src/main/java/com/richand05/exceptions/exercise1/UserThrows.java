package com.richand05.exceptions.exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UserThrows  {

    public static void main(String[] args) {
        try{
            readFile();
        }catch (NoSuchFileException e){
            System.err.println("No carga el archivo, verifique si existe");
        }catch (IOException e){
            System.err.println("Puede ser por otro error");
        }
    }

    public static void readFile() throws IOException {

        String separator = File.separator;

        String rutaArchivo = "C:" + separator + "Users" + separator + "andre" + separator + "Documents" + separator + "Worskpace" + separator + "docs-test" + separator + "RandomTask.txt";
        Path archivo = Paths.get(rutaArchivo);


        List<String> lineas = Files.readAllLines(archivo);

        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}
