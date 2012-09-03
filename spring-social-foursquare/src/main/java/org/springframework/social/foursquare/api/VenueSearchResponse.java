package org.springframework.social.foursquare.api;

import java.util.List;

public class VenueSearchResponse {
	
	List<Venue> venues;
    GeoCode geoCode;
    
    public VenueSearchResponse(List<Venue> venues, GeoCode geoCode) {
        this.venues = venues;
        this.geoCode = geoCode;
    }

    public List<Venue> getVenues() {
        return venues;
    }
    
    public GeoCode getGeoCode() {
    	return geoCode;
    }
    
    public List<Venue> setVenues() {
        return venues;
    }
    
    public GeoCode setGeoCode() {
    	return geoCode;
    }
	
}
