package DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Factory;

import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.PdfExporter;
import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.ProductExporter;

public class PdfDocumentImp implements DocumentFactory{

    @Override
    public ProductExporter createObject(){
        return new PdfExporter();
    }
    
}
