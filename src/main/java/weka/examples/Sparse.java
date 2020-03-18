package weka.examples;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.instance.NonSparseToSparse;

import java.io.File;

public class Sparse {


    public static void main(String[] args) throws Exception {
     DataSource  source = new DataSource("C:\\Bala\\Programowanie\\programy\\wekaexample\\covid19.arff");
        Instances dataSet = source.getDataSet();

        NonSparseToSparse sp = new NonSparseToSparse();

        sp.setInputFormat(dataSet);

        Instances newData = Filter.useFilter(dataSet,sp);

        ArffSaver saver = new ArffSaver();

        saver.setInstances(newData);
        saver.setFile(new File("C:\\Bala\\Programowanie\\covid19sparse.arff"));
        saver.writeBatch();
    }
}
