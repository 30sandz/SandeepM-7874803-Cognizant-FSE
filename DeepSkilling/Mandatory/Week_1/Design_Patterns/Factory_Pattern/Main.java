package DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern;

import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Factory.DocumentFactory;
import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Factory.PdfDocumentImp;
import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.ProductExporter;

public class Main {
    public static void main(String args[]){

        DocumentFactory factory = new PdfDocumentImp();

        ProductExporter product = factory.createObject();

        product.export();


    }
}
