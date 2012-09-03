package org.springframework.social.foursquare.api.impl.json;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.foursquare.api.Venue;
import org.springframework.social.foursquare.api.GeoCode;
import org.springframework.social.foursquare.api.VenueSearchResponse;

@JsonDeserialize(using=VenueSearchContainerDeserializer.class)
public class VenueSearchContainer {
    
    List<Venue> venues;
    GeoCode geoCode;
    
    public VenueSearchContainer(List<Venue> venues, GeoCode geoCode) {
        this.venues = venues;
        this.geoCode = geoCode;
    }

    public List<Venue> getVenues() {
        return venues;
    }
    
    public GeoCode getGeoCode() {
    	return geoCode;
    }
    
    public  VenueSearchResponse getVenueSearchResponse() {
    	return new VenueSearchResponse(venues,geoCode);
    }
    
}
