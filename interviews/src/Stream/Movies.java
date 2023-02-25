package Stream;

public class Movies {

	@Override
	public String toString() {
		return "Movies [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	String name;

	String year;

	Integer rating;

}
