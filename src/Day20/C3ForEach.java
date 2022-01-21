package Day20;

public class C3ForEach {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5,};
        for (int eachNumber : numbers) {
            System.out.println(eachNumber);
        }
        String sentence="Hello lovely Java people!";
        String[]words= sentence.split("-");
        for(String word:words){
            System.out.println(word);
        }


    }
}
