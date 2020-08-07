package edu.escuelaing.arep.ASE.app.Statistics;

import edu.escuelaing.arep.ASE.app.utilities.LinkedList;

public class StatisticsModule {

    public static Double mean(LinkedList<Double> linkedList){
        Double sum=0.0;
        for (Double i: linkedList) {
            sum+=i;
        }
        double mean=sum/ linkedList.size();
        mean= Math.round(mean * 100.0) / 100.0;

        return mean ;
    }

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
