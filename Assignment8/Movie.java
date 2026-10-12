class Movie {
    String title;
    String director;
    String actor;
    String reviews;

    Movie(String t, String d, String a) {
        title = t;
        director = d;
        actor = a;
    }

    void addReviews(String r) {
        reviews = r;
    }

    void display() {
        System.out.println("Movie Details:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actor: " + actor);
        System.out.println("Reviews: " + reviews);
    }

    public static void main(String args[]) {
        Movie m = new Movie("Salaar", "Prashanth Neel", "Prabhas");

        m.addReviews("This movie is Good");
        m.display();
    }
}