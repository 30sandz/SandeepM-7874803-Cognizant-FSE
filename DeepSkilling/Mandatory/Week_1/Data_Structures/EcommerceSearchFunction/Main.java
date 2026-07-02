import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Product objects[] = {
            new Product(1, "asus", "laptop", 100),
            new Product(2,  "lenovo", "laptop", 100),
            new Product(3, "samsung", "mobile", 150) 
        };

        System.out.println(Search.linearSearch(objects, 2));
        System.out.println(Search.binarySearch(objects, 2));
    }
}