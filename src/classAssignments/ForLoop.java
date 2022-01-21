package classAssignments;

public class ForLoop {
    public static void main(String[] args) {
        double x, y=1000, sum=0, say=0;
        for(x=1; x<=y; x++){
            if(x%3==0 && x%5==0){
                System.out.println(x);
                sum=sum+x;
                ++say;
                if(say==5)break;
            }
            System.out.println(sum);

        }


    }
}
