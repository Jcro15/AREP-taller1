package edu.escuelaing.arep.ASE.app;

import edu.escuelaing.arep.ASE.app.Statistics.StatisticsModule;
import edu.escuelaing.arep.ASE.app.utilities.LinkedList;

import java.io.*;

/**
 * Aplicación encargada de calcular la media y la desviación estandar de unos valores leidos
 * de un archivo plano
 *
 */
public class App 
{
    /**
     *Función encargada de leer los archivos de entrada, tomar las listas, calcular los valores de media y
     * desviación estándar  y mostrarlos
     * @param args
     */
    public static void main( String[] args ) {
        LinkedList<Double> case1=BuildListFromInputFile("cases\\input1.txt");
        LinkedList<Double> case2=BuildListFromInputFile("cases\\input2.txt");
        System.out.println("La media para los valores del archivo input1 es: "+ StatisticsModule.mean(case1));
        System.out.println("La media para los valores del archivo input2 es: "+StatisticsModule.mean(case2));
        System.out.println("La desviación estándar para los valores del archivo input1 es: "+StatisticsModule.standardDeviation(case1));
        System.out.println("La desviación estándar para los valores del archivo input2 es: "+StatisticsModule.standardDeviation(case2));

    }

    /**
     * lee los valores de entrada de un archivo y almacena estos valores en una nueva LinkedList
     * @param path la ruta del archivo
     * @return una LinkedList con los valores que se encontraban en el archivo especificado
     */
    private static LinkedList<Double> BuildListFromInputFile(String path) {
        LinkedList<Double> linkedList= new LinkedList<>();
        File file = new File(path);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            double value;
            String line;
            line=br.readLine();
            while (line!=null){
                value=Double.parseDouble(line);
                linkedList.add(value);
                line=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedList;
    }
}
