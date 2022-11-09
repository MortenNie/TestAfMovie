import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        createMovies(movies);
        System.out.println(movies.get(0).rating);


    }

    public static void createMovies(ArrayList<Movie> movies) {
        try {
            File f = new File( "listOfMovies");
            Scanner s = new Scanner(f);



            while (s.hasNextLine()) {
                String [] values = s.nextLine().split("; ");
                String n = values[0];
                int r = Integer.parseInt(values[1]);
                String c = values[2];
                String t = values[3];

                Movie m = new Movie(n, r, c, t);

                movies.add(m);
            }


        } catch (IOException e) {
            System.out.println("Error");


        }
    }

}