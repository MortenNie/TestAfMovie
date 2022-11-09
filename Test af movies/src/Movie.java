import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Movie {
   String name;
   int releaseYear;
   String category;
   String rating;



    public Movie(String name, int releaseYear, String category, String rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.category = category;
        this.rating = rating;


    }

    @Override
    public String toString() {
        return "Name: " + name;
    }




    }




