import  weka.*;
import weka.core.Instances;
import weka.core.converters.ArffSaver;

import java.io.*;

public class WeakTest {

    public static void main(String[] args) throws IOException {

        Instances dataSet = new Instances(new BufferedReader(new FileReader("C:\\Bala\\Programowanie\\programy\\wekaexample\\covid19.arff")));

        System.out.println(dataSet.toSummaryString());

        ArffSaver saver = new ArffSaver();
        saver.setInstances(dataSet);
        saver.setFile(new File("C:\\Bala\\Programowanie\\covid19.arff"));
        saver.writeBatch();

    }

}
