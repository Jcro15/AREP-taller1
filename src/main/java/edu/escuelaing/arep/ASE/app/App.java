package edu.escuelaing.arep.ASE.app;

import edu.escuelaing.arep.ASE.app.Statistics.StatisticsModule;
import edu.escuelaing.arep.ASE.app.utilities.LinkedList;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        LinkedList<Double> case1=BuildListFromInputFile("cases\\input1.txt");
        LinkedList<Double> case2=BuildListFromInputFile("cases\\input2.txt");
        System.out.println(StatisticsModule.standardDeviation(case1));
        System.out.println(StatisticsModule.standardDeviation(case2));

    }

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
