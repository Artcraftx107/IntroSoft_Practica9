import java.util.List;

public class Movie {

	private String title;
	private int duration;
	private int trailerDuration;
	private List<String> genres;

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTrailerDuration() {
		return this.trailerDuration;
	}

	/**
	 * 
	 * @param trailerDuration
	 */
	public void setTrailerDuration(int trailerDuration) {
		if(trailerDuration>180){
			throw new RuntimeException("La duracion del trailer no puede ser mayor a 3 minutos");
		}else{
			this.trailerDuration=trailerDuration;
		}
	}

	public List<String> getGenres() {
		return this.genres;
	}

	/**
	 * 
	 * @param genres
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

}