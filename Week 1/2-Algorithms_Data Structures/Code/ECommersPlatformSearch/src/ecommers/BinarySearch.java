package ecommers;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Product[] p= new Product[5];
        p[0]= new Product(17,"rolex","watches");
        p[1]= new Product(20,"infinix","mobile");
        p[2]= new Product(39,"pavillion","laptop");
        p[3]= new Product(41,"titan","watches");
        p[4]= new Product(50,"oppo buds","accessories");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int low=0;
        int high=p.length-1;
        int mid=(low+high)/2;
        int count=0;
        for(int i=0;low<=high;i++){
            if(p[mid].ProductId==n){
                System.out.println("Product is found at index:"+mid);
                count=1;
                break;
            }
            else if(n>p[mid].ProductId){
                low=mid+1;
                mid=(low+high)/2;

            }
            else{
                high=mid-1;
                mid=(low+high)/2;
            }
           
        }
        if(count==0){
            System.out.println("Product is not found");
        }
        sc.close();

    }
}
