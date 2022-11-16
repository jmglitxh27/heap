import java.util.*;

public abstract class MyHeap<M> extends Movie implements MyQueue<M>{
  	private M movie; 
	//static generic method 
	public static <M> void displayAllMovies(ArrayList<M> Arraylist) {
		for (M movie : Arraylist) {
			System.out.println(movie);
		}
	}
  public void addMovie(Movie m, ArrayList<Movie> list){
    list.add(m);
  }
  public void clearAll(ArrayList<Movie> list) {
    list.clear();
  }
  public void isEmpty(ArrayList<Movie> list){
    list.isEmpty();
  }
  public M peekMovie(ArrayList<Movie> list){
    return list.peek(movie);
  }
  public void pushMovie(ArrayList<Movie> list, M movie){
    list.push(movie);
  }
  public void removeMovie(ArrayList<Movie> list, M movie){
    list.remove(movie);
  }
  public int size(ArrayList<Movie> list){
    return list.size();
  }
	public void sort(ArrayList<Movie> list){
		int N = list.size();
		
		for (int i = N / 2 - 1; i >= 0; i--)
			heapify(list, N, i);
 
        for (int i = N - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list , i, 0);
        }
    }
    void heapify(ArrayList<Movie> list, int N, int i) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < N && list. > list.get(largest))
            largest = l;
 
        if (r < N && list.get(r) > list.get(largest))
            largest = r;
 
        if (largest != i) {
            Collections.swap(list, i, largest);
            heapify(list, N, largest);
        }
    }
}s