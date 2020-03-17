package weka.examples;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.File;
import java.io.IOException;

public class ConvertCsvToArff {

    public static void main(String[] args) throws IOException {

    CSVLoader loader = new CSVLoader();
    loader.setSource(new File("C:\\Bala\\Programowanie\\covid19.csv"));
    Instances data = loader.getDataSet();

        ArffSaver saver = new ArffSaver();
        saver.setInstances(data);
        saver.setFile(new File("C:\\Bala\\Programowanie\\covid19.arff"));
        saver.writeBatch();

    }
}
