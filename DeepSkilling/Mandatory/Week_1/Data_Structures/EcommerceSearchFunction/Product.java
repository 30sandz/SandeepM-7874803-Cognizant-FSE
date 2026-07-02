


class Product implements Comparable<Product>{
    private int id;
    private String name;
    private String categroy;
    private int price;

    public Product(int id, String name, String category, int price){
        this.id = id;
        this.name= name;
        this.categroy=category;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    @Override
    public int compareTo(Product other){
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString(){
        return " Product id: "+this.id+
                " Name"+this.name+
                " Category "+this.categroy +
                " Price "+ this.price;
    }


}