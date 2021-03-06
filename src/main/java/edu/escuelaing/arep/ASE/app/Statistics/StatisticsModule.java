package edu.escuelaing.arep.ASE.app.Statistics;

import edu.escuelaing.arep.ASE.app.utilities.LinkedList;

/**
 * Modulo de estadisticas que provee el calculo de algunas funciones estadisticas fundamentales como la media
 * y la desviacion estandar
 */
public class StatisticsModule {
    /**
     * Calcula la media de un conjunto de valores almacenado en una LinkedList
     * @param linkedList la lista que almacena los valores
     * @return la media de los valores almacenados en la lista redondeado a 2 decimales
     */
    public static Double mean(LinkedList<Double> linkedList){
        Double sum=0.0;
        for (Double i: linkedList) {
            sum+=i;
        }
        double mean=sum/ linkedList.size();
        mean= Math.round(mean * 100.0) / 100.0;

        return mean ;
    }

    /**
     * Calcula la desviación estándar de un conjunto de valores almacenado en una LinkedList
     * @param linkedList la lista que almacena los valores
     * @return la desviación estándar de los valores almacenados en la lista redondeado a 2 decimales
     */
    public static Double standardDeviation(LinkedList<Double>linkedList){
        double sum=0.0;
        double mean=mean(linkedList);
        for (Double i:linkedList) {
            sum+=Math.pow(i-mean,2);
        }
        double standardDeviation=Math.sqrt(sum/(linkedList.size()-1));
        standardDeviation=Math.round(standardDeviation * 100.0) / 100.0;
        return standardDeviation ;
    }
}
