package HomeMovies.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import HomeMovies.model.User;

@Repository
public interface UserRepo extends CrudRepository <User, Long>{

}