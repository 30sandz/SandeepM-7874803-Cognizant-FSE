package DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product;

public class PdfExporter implements ProductExporter{
    @Override
    public void export(){
        System.out.println("Exporting Document to PDF");
    }
}
