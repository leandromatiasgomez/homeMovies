package HomeMovies.repoService;

import java.util.List;
import java.util.Optional;

import HomeMovies.model.User;

public interface UserServiceRepo {
	
	public List<User> list();
	public Optional<User> listId(int id);
	public int save(User u);
	public void delete(int id);

}
