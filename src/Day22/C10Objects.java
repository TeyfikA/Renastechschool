package Day22;

public class C10Objects {
    public static void main(String[] args) {
        Song s1=new Song();
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
        s1.setArtist("Shakira");
        s1.setTitle("Whenever Whereever!!");
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());

    }
}
class Song{
    String artist,title;
    void setArtist(String artist){this.artist=artist;}
    String getArtist(){return this.artist;}
    void setTitle(String title){this.title=title;}
    String getTitle(){return this.title;}


}
