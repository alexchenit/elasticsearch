package com.example.aws.elasticsearch.demo.document;

import com.example.aws.elasticsearch.demo.model.Technologies;
        import lombok.Data;

        import java.util.List;

@Data
public class ProfileDocument {

    public ProfileDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProfileDocument [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", technologies="
				+ technologies + ", location=" + location + ", emails=" + emails + "]";
	}
	public ProfileDocument(String id, String firstName, String lastName, List<Technologies> technologies,
			Location location, List<String> emails) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.technologies = technologies;
		this.location = location;
		this.emails = emails;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Technologies> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Technologies> technologies) {
		this.technologies = technologies;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	private String id;
    private String firstName;
    private String lastName;
    private List<Technologies> technologies;
    private Location location;
    private List<String> emails;

}
