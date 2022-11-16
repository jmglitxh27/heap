import java.util.*;

public interface MyQueue<M>{
  	public void addMovie(M movie, ArrayList<Movie> list);
    public void clearAll(ArrayList<Movie> list);
    public void isEmpty(ArrayList<Movie> list);
    public M peekMovie(ArrayList<Movie> list);
    public void pushMovie(ArrayList<Movie> list, Movie m);
    public void removeMovie();
    public int size(ArrayList<Movie> list);
}