import java.util.Arrays;
import java.util.Random;

public class Media_Manager implements MediaPlayer{

     Movie[] movies;
    static int movieNumber;
    SortComparator comparator;



    public Media_Manager() {
        this.movies = new Movie[100];
         comparator = new SortComparator();
        movieNumber=1;

        for (int i=0; i<movies.length; i++) {
            Movie obj= new Movie("Batman "+movieNumber++,"John Deep",344354,9,getRandom());
            movies[i]=obj;
        }


      }

    @Override
    public void play() {
        System.out.println("Playing Media");
    }

    public int getRandom() {
        Random random = new Random();
        int year =  random.nextInt(2000,2024);
        return year;

    }
    
    @Override
    public void pause() {
        System.out.println("Pausing Media");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping Media");
    }
    
    @Override
    public void next() {
        System.out.println("Moving to Next Media");
    }
    public void sortbyYear(){
        Arrays.sort(movies,(Movie o1,Movie o2) -> o1.getYear() - o2.getYear());
        System.out.println("Sorted by Year");
        for(Movie movie: movies){
            System.out.println(movie);
        }
    }
    
    @Override
    public void previous() {
        System.out.println("Moving to Previous Media");
    }
    public int search(Movie m){
        int index=Arrays.binarySearch(movies,m);
        return index;


    }



}
