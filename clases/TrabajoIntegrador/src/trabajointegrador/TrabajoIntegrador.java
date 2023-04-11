
package trabajointegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TrabajoIntegrador {

 
    public static void main(String[] args) throws IOException {
       //codigo para leer el archivo
        String archivo = "C:\\Users\\renzo\\Desktop\\UTN prog\\pronostico.txt";
        for (String linea : Files.readAllLines(Paths.get(archivo))) {
            System.out.println(linea);


    }
    }
}
