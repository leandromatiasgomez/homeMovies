package HomeMovies.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import HomeMovies.model.User;
import HomeMovies.repoService.UserServiceRepo;

@Controller 
@RequestMapping 
public class UserController {
	
	@Autowired
	private UserServiceRepo service;
	
	@GetMapping("/listUser")
	public String list(Model model) {
		List<User> users= service.list();
		model.addAttribute("users", users);
		return "listUser";
	}
	
	@GetMapping("/newUser")
	public String add(Model model) {
		model.addAttribute("user", new User());
		return "formUser";
	}
	
	@PostMapping("/saveUser")
	public String save(@Validated User u, Model model) {
		service.save(u);
		return "redirect:/listUser";
	}
	
	@GetMapping("/editUser/{id}")
	public String edit(@PathVariable int id, Model model) {
		Optional<User>user=service.listId(id);
		model.addAttribute("user", user);
		return "formUser";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.delete(id);
		return"redirect:/listUser";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return"register";
	}
}
