import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME ------");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total person count: ");
        int n = sc.nextInt();
        String [] name = new String[n+1];
        long [] income = new long[n+1];

        for(int i=1;i<n+1;i++){
            System.out.println("Enter name "+ i +" : ");
            name[i]=sc.next();
            System.out.println("Enter " + name[i] + " Annual Income: ");
            income[i]=sc.nextLong();
        }
        sc.close();
        for(int i =1;i<=n;i++){
            calculateTax(name,income,i);
        }

    }

    private static void calculateTax(String[] name, long[] income,int i) {
        System.out.println();
        System.out.println("Names with liable taxes");
        System.out.println("-----------------------");
       double[] tax=new double[i];
            if(income[i] >=300000){
                tax[i]=income[i]*0.20;
            }
            else if(income[i]>=100000 & income[i]<300000){
                tax[i]=income[i]*0.10;
            }
            else{
                tax[i]=0;
            }
            System.out.println(name[i]+ " : ₹ "+tax[i] );
}
}
