package weka.examples;


import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

import java.io.File;

public class FilteringAtributes {

    public static void main(String[] args) throws Exception {
   DataSource source = new DataSource("C:\\Bala\\Programowanie\\programy\\wekaexample\\covid19.arff");
        Instances dataSet = source.getDataSet();


        //usunie pierwszy atrybut jest jeszcze opcja usuwania z -V ale trza sprawdzić w dokumentacji jak działa
        String[] opts = new String[]{"-R","1"};

        Remove remove = new Remove();

        remove.setOptions(opts);

        remove.setInputFormat(dataSet);

        Instances newData = Filter.useFilter(dataSet,remove);

        ArffSaver saver = new ArffSaver();
        saver.setInstances(newData);
        saver.setFile(new File("C:\\Bala\\Programowanie\\covid19withFilter.arff"));
        saver.writeBatch();


    }
}
