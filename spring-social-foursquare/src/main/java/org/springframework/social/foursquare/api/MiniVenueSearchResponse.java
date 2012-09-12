package org.springframework.social.foursquare.api;

import java.util.List;

public class MiniVenueSearchResponse {
	
	List<Venue> venues;
    
    public MiniVenueSearchResponse(List<Venue> venues) {
        this.venues = venues;
    }

    public List<Venue> getVenues() {
        return venues;
    }
    
    public List<Venue> setVenues() {
        return venues;
    }
    
}
