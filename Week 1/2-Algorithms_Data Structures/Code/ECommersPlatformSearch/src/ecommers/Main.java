package ecommers;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Product[] p={
            new Product(1,"rolex","watches"),
            new Product(2,"benz","car"),
            new Product(3,"infinix","mobile"),
            new Product(4,"titan","watches"),
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Searching the product using linear search");
        System.out.print("Enter the product Id to be searched:");
        int n=sc.nextInt();
        for(int i=0;i<p.length;i++){
            if(i==p.length-1 && n!=p[i].ProductId) {
                System.out.println("Product not found.");
                break;
            }
            if(p[i].ProductId==n){
                System.out.println("Found the product at the index "+i);
                System.out.println(p[i]);
                break;
            }
        }
        sc.close();
        
    }
}
