package com.richand05.exercises.exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String separator = File.separator;

        String rutaArchivo = "C:"+separator+"Users"+separator+"andre"+separator+"Documents"+separator+"Worskpace"+separator+"docs-test"+separator+"RandomTask.txt";
        Path archivo = Paths.get(rutaArchivo);

        try {

            List<String> lineas = Files.readAllLines(archivo);

            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (NoSuchFileException e) {
            System.err.println("El archivo no se encuentra: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
