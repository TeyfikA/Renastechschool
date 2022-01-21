package Day9;

public class C6ForLOOPevenandodd {
    public static void main(String[] args) {
        int m=0;

       System.out.println("Odd\t\tEven\tOdd\t\tEven");
       for( m=m; m<50;){
           System.out.println(++m+"\t\t"+ ++m +"\t\t"+ ++m+ "\t\t"+ ++m);
       }
    }
}
