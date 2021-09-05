package variables;

public class ProfileObject {

	private String instructor, url, services, expertise, linkedIn;
	
	private CourseObject courses;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getServices() {
		return services;
	}

	public CourseObject getCourses() {
		return courses;
	}

	public void setCourses(CourseObject courses) {
		this.courses = courses;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
}
