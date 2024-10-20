package HomeMovies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HomeMovies.model.Movie;
import HomeMovies.repo.MovieRepo;
import HomeMovies.repoService.MovieServiceRepo;

@Service 
public class MovieService implements MovieServiceRepo{

	@Autowired
	private MovieRepo data;
	
	@Override
	public List<Movie> list() {
		return (List<Movie>)data.findAll();
	}

	@Override
	public Optional<Movie> listId(int id) {
		return data.findById((long) id);
	}

	@Override
	public int save(Movie m) {
		int res = 0;
		Movie movie = data.save(m);
		if(!movie.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById((long) id);
	}

}
