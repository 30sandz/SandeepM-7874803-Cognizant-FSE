

package DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Factory;

import DeepSkilling.Mandatory.Week_1.Design_Patterns.Factory_Pattern.Product.ProductExporter;

public interface DocumentFactory {
    
    ProductExporter createObject();
}
