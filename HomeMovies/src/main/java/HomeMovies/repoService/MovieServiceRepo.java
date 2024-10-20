package HomeMovies.repoService;

import java.util.List;
import java.util.Optional;

import HomeMovies.model.Movie;

public interface MovieServiceRepo {
	
	public List<Movie> list();
	public Optional<Movie> listId(int id);
	public int save(Movie m);
	public void delete(int id);
	
}
