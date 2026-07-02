

public class Search{

    public static Product linearSearch(Product[] arr, int id){

        for(Product p:arr){
            if(p.getId()==id){
                return p;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] arr, int id){
        int l=0, r=arr.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;
            Product p = arr[mid];
            if(p.getId()>id){
                r = mid-1;
            }else if(p.getId() < id){
                l = mid+1;
            }else if(p.getId()==id){
                return p;
            }
        }
        return null;
    }


     
}