import java.util.List;

public class MovieManager {
	private List<Movie> movies;

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public void editMovie(Movie movie) {
		boolean found = false;
		int pos = 0;
		while(pos<movies.size() && !found){
			if(movie.equals(movies.get(pos))){
				found=true;
				movies.set(pos, movie);
			}
		}
	}

	public void deleteMovie(Movie movie) {
		movies.remove(movie);
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}