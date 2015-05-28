package ab.demo;
import java.io.BufferedWriter;
import java.io.FileWriter;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class NaiveBayesTest {
	

	public static void main(String args[]) throws Exception{

		DataSource source = new DataSource("dataset/birds.data.arff"); //initialise the learning set for the agent
		Instances data = source.getDataSet();
		
		 // setting class attribute if the data format does not provide this information
		 // For example, the XRFF format saves the class attribute information as well
		 if (data.classIndex() == -1)
		   data.setClassIndex(data.numAttributes() - 1);
		 
		 DataSource thisLevel = new DataSource("dataset/birds.level.arff"); //
		 Instances thisLevelData = thisLevel.getDataSet();
		 if (thisLevelData.classIndex() == -1)
			   thisLevelData.setClassIndex(data.numAttributes() - 1);
		 
		 //build a new NaiveBayes classifier
		 NaiveBayes bayes = new NaiveBayes();
		 bayes.buildClassifier(data);
		 
		 for(int i = 0; i < thisLevelData.numInstances(); i++){ //for all instances in the current level
			 double label = bayes.classifyInstance(thisLevelData.instance(i)); //generate an outcome/classify an instance in the current level
	         thisLevelData.instance(i).setClassValue(label); //store this outcome
		     System.out.println("Instance " + i + " " + thisLevelData.instance(i).stringValue(5)); //print it
		     if(thisLevelData.instance(i).stringValue(5) != "?"){ //if there is a definite decision as to whether a shot should be taken
		    	 data.add(thisLevelData.instance(i)); //store it
		     }
		 }
		 
		 //add all non ? entries to the learning set
		 //BufferedWriter writer = new BufferedWriter(new FileWriter("dataset/birds.data.arff"));
		 //writer.write(data.toString());
		 //writer.flush();
		 //writer.close();
	}
	
}
