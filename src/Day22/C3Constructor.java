package Day22;

public class C3Constructor {
    public static void main(String[] args) {
        new Movie();
        new Movie();
        Movie m1 = new Movie("Titanic", 1997);
        m1.watchMovie();


    }

    static class Movie {
        private String title;
        private String actor;
        private short year;

        void watchMovie() {
            System.out.println("watching" + this.title + "....");
        }

        Movie() {
        }

        Movie(String title, int year) {
            this.title = title;
            this.year = (short) year;
            System.out.println("Constructor is called");
        }
    }
}

