package org.springframework.social.foursquare.api;

import java.util.List;

public class GeoCodeBounds {
	
	GeoCodeGeoPt ne; // northeast
    GeoCodeGeoPt sw; // southwest
    
    
    
    public GeoCodeBounds(GeoCodeGeoPt ne, GeoCodeGeoPt sw) {
            this.ne = ne;
            this.sw = sw;
    }
    
    public GeoCodeGeoPt getNe() {
            return ne;
    }
    public GeoCodeGeoPt getSw() {
            return sw;
    }
	
}
