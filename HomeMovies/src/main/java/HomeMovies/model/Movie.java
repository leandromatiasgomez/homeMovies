package HomeMovies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "movies")
public class Movie {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public long id;

	@Column
	public String title;
	
	@Column
	public String synopsis;
	
	@Column
	public int priceperday;

	@Column
	public String image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getPriceperday() {
		return priceperday;
	}

	public void setPriceperday(int priceperday) {
		this.priceperday = priceperday;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
