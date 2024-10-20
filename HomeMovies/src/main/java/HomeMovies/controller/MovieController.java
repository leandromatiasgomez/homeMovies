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

import HomeMovies.model.Movie;
import HomeMovies.repoService.MovieServiceRepo;

@Controller 
@RequestMapping
public class MovieController {
	
	@Autowired
	private MovieServiceRepo service;
	
	@GetMapping("/listMovie")
	public String list(Model model) {
		List<Movie> movies = service.list();
		model.addAttribute("movies", movies);
		return "listMovie";
	}

	@GetMapping("/newMovie")
	public String add(Model model) {
		model.addAttribute("movie", new Movie());
		return "formMovie";
	}
	
	@PostMapping("/saveMovie")
	public String save(@Validated Movie m, Model model) {
		service.save(m);
		return "redirect:/listMovie";
	}

	@GetMapping("/editMovie/{id}")
	public String edit(@PathVariable int id ,Model model) {
		Optional<Movie> movie = service.listId(id);
		model.addAttribute("movie", movie);
		return "editMovie";
	}

	@GetMapping("/deleteMovie/{id}")
	public String delte(@PathVariable int id) {
		service.delete(id);
		return "redirect:/listMovie";
	}
		
	
	
}
