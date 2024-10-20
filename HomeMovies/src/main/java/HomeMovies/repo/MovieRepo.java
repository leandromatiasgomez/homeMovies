package HomeMovies.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import HomeMovies.model.Movie;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Long>{
	
	

}
