package org.springframework.social.foursquare.api;

import java.util.List;

public class GeoCodeGeoPt {
	
	public Double lat;
    public Double lon;
    

    public GeoCodeGeoPt(Double lat, Double lon) {
            this.lat = lat;
            this.lon = lon;
    }

    public Double getLat() {
            return lat;
    }

    public Double getLon() {
            return lon;
    }
	
}
