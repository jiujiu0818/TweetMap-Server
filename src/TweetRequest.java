import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;


public class TweetRequest {
    private String id_str;
    private String created_at;
    private String text;
    private String user;
    private double longitude;
    private double latitude;
    private double sentiment;
    
    public TweetRequest(String id_str, String created_at, String text, String user, double 
    		longitude, double latitude, double sentiment) {
    	this.id_str=id_str;
    	this.created_at=created_at;
    	this.text=text;
    	this.user=user;
    	this.longitude=longitude;
    	this.latitude=latitude;
    	this.sentiment=sentiment;
    }
    
	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

    
    
    public double getSentiment() {
		return sentiment;
	}

	public void setSentiment(double sentiment) {
		this.sentiment = sentiment;
	}


    
}
