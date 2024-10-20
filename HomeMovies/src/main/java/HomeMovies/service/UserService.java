package HomeMovies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HomeMovies.model.User;
import HomeMovies.repo.UserRepo;
import HomeMovies.repoService.UserServiceRepo;

@Service
public class UserService implements UserServiceRepo{
	
	@Autowired
	private UserRepo data;

	@Override
	public List<User> list() {
		return (List<User>)data.findAll();
	}

	@Override
	public Optional<User> listId(int id) {
		return data.findById((long) id);
	}

	@Override
	public int save(User u) {
		int res = 0;
		User user = data.save(u);
		if(!user.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById((long) id);
	}

}
