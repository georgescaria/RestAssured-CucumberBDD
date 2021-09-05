package variables;

import java.util.List;

public class GetPlaceObject {

	
	private LocationObject location;
	private int accuracy;
	private String name, phone_number, address, website,language;
	private String types;
	public LocationObject getLocation() {
		return location;
	}
	public void setLocation(LocationObject location) {
		this.location = location;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}

	
	
}

class LocationObject{
	
	private double latitude, longitude;
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double lat) {
		this.latitude = lat;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double lng) {
		this.longitude = lng;
	}

	
}