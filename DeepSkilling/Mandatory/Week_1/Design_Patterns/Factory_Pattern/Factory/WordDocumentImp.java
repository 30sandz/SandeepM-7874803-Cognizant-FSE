package DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Factory;

import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.ProductExporter;
import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.WordExporter;

public class WordDocumentImp implements DocumentFactory{

    @Override
    public ProductExporter createObject(){
        return new WordExporter();
    }
}
