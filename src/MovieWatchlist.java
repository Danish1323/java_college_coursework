import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieWatchlist {
    static String fileName = "movies.txt";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n =============================== \n");
            System.out.println("      Movie Watch list      ");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Search Movies");
            System.out.println("4. Update movie rating");
            System.out.println("5. Delete Movie");
            System.out.println("6. Count Movies");
            System.out.println("7. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                addMovie(sc);
            } else if (choice == 2) {
                viewMovie();
            } else if (choice == 3) {
                searchMovie(sc);
            } else if (choice == 4) {
                updateMovie(sc);
            } else if (choice == 5) {
                deleteMovie(sc);
            } else if (choice == 6) {
                countMovies();
            } else if (choice == 7) {
                System.out.println("\n Thank you for using movie watchlist");
                break;
            }else{
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }


    // 1. Add Movie
    static void addMovie(Scanner sc){
        System.out.println("\n ---------- Add Movie ------------");

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        System.out.print("Enter release year: ");
        String year = sc.nextLine();

        System.out.print("Enter your rating out of 10: ");
        String rating = sc.nextLine();

        String movie = name + "|" + genre + "|" + year + "|" + rating + "\n";

        try{
            FileOutputStream fos = new FileOutputStream(fileName, true);

            fos.write(movie.getBytes());
            fos.close();

            System.out.println("Movie Added Successfully");
        }catch (IOException e){
            System.out.println("Error while saving movie");
        }
    }


    // 2. View Movies
    static void viewMovie(){
        System.out.println("\n ---------- Movie Watchlist ------------");

        try{
            File file = new File(fileName);

            if(!file.exists() || file.length() == 0){
                System.out.println("No movies found in watchlist");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileSc = new Scanner(fis);

            int count = 1;

            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();

                String[] movie = line.split("\\|");

                if(movie.length == 4){
                    System.out.println("\nMovie " + count);
                    System.out.println("Name: " + movie[0]);
                    System.out.println("Genre: " + movie[1]);
                    System.out.println("Release Year: " + movie[2]);
                    System.out.println("Rating: " + movie[3] + "/10");

                    count++;
                }
            }

            fileSc.close();
            fis.close();

        }catch (IOException e){
            System.out.println("Error while reading movies");
        }
    }


    // 3. Search Movies
    static void searchMovie(Scanner sc){
        System.out.println("\n ---------- Search Movie ------------");

        System.out.print("Enter movie name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        try{
            File file = new File(fileName);

            if(!file.exists()){
                System.out.println("No movies found in watchlist");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileSc = new Scanner(fis);

            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();

                String[] movie = line.split("\\|");

                if(movie.length == 4 &&
                        movie[0].equalsIgnoreCase(searchName)){

                    System.out.println("\nMovie Found!");
                    System.out.println("Name: " + movie[0]);
                    System.out.println("Genre: " + movie[1]);
                    System.out.println("Release Year: " + movie[2]);
                    System.out.println("Rating: " + movie[3] + "/10");

                    found = true;
                }
            }

            fileSc.close();
            fis.close();

            if(!found){
                System.out.println("Movie not found");
            }

        }catch (IOException e){
            System.out.println("Error while searching movies");
        }
    }


    // 4. Update Movie Rating
    static void updateMovie(Scanner sc){
        System.out.println("\n ---------- Update Movie Rating ------------");

        System.out.print("Enter movie name to update: ");
        String searchName = sc.nextLine();

        boolean found = false;

        ArrayList<String> movies = new ArrayList<>();

        try{
            File file = new File(fileName);

            if(!file.exists()){
                System.out.println("No movies found in watchlist");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileSc = new Scanner(fis);

            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();

                String[] movie = line.split("\\|");

                if(movie.length == 4 &&
                        movie[0].equalsIgnoreCase(searchName)){

                    System.out.println("Current Rating: " + movie[3]);

                    System.out.print("Enter new rating out of 10: ");
                    String newRating = sc.nextLine();

                    movie[3] = newRating;

                    line = movie[0] + "|" + movie[1] + "|" +
                            movie[2] + "|" + movie[3];

                    found = true;

                    System.out.println("Movie Rating Updated Successfully");
                }

                movies.add(line);
            }

            fileSc.close();
            fis.close();

            if(!found){
                System.out.println("Movie not found");
                return;
            }

            FileOutputStream fos = new FileOutputStream(fileName);

            for(String movie : movies){
                fos.write((movie + "\n").getBytes());
            }

            fos.close();

        }catch (IOException e){
            System.out.println("Error while updating movie");
        }
    }


    // 5. Delete Movie
    static void deleteMovie(Scanner sc){
        System.out.println("\n ---------- Delete Movie ------------");

        System.out.print("Enter movie name to delete: ");
        String deleteName = sc.nextLine();

        boolean found = false;

        ArrayList<String> movies = new ArrayList<>();

        try{
            File file = new File(fileName);

            if(!file.exists()){
                System.out.println("No movies found in watchlist");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileSc = new Scanner(fis);

            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();

                String[] movie = line.split("\\|");

                if(movie.length == 4 &&
                        movie[0].equalsIgnoreCase(deleteName)){

                    found = true;
                    System.out.println("Movie Deleted: " + movie[0]);

                }else{
                    movies.add(line);
                }
            }

            fileSc.close();
            fis.close();

            if(!found){
                System.out.println("Movie not found");
                return;
            }

            FileOutputStream fos = new FileOutputStream(fileName);

            for(String movie : movies){
                fos.write((movie + "\n").getBytes());
            }

            fos.close();

            System.out.println("Movie Deleted Successfully");

        }catch (IOException e){
            System.out.println("Error while deleting movie");
        }
    }


    // 6. Count Movies
    static void countMovies(){
        System.out.println("\n ---------- Count Movies ------------");

        int count = 0;

        try{
            File file = new File(fileName);

            if(!file.exists()){
                System.out.println("Total Movies: 0");
                return;
            }

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileSc = new Scanner(fis);

            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();

                String[] movie = line.split("\\|");

                if(movie.length == 4){
                    count++;
                }
            }

            fileSc.close();
            fis.close();

            System.out.println("Total Movies in Watchlist: " + count);

        }catch (IOException e){
            System.out.println("Error while counting movies");
        }
    }
}
