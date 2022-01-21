package Day8;

public class C8SwitchCase {
    public static void main(String[] args) {
        char color='I';
        switch(color){
            case 'i': System.out.println("color is Indigo");
            case'I': System.out.println("color is Indigo");break;
            case'v': System.out.println("color is Violet");
            case'V':System.out.println("color is Violet");break;
            case'b':System.out.println("color is Blue");
            case'B':System.out.println("color is Blue");break;
            default:System.out.println("no color");
        }
    }
}