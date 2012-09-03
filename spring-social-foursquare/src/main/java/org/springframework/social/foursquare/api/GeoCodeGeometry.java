package org.springframework.social.foursquare.api;

import java.util.List;

public class GeoCodeGeometry {
	
	/**
     * centerpoint
     */
    GeoCodeGeoPt center;
    
    /**
     * Bounding Box
     */
    GeoCodeBounds bounds;

    public GeoCodeGeometry(GeoCodeGeoPt center, GeoCodeBounds bounds) {
            this.center = center;
            this.bounds = bounds;
    }

    public GeoCodeGeoPt getCenter() {
            return center;
    }

    public GeoCodeBounds getBounds() {
            return bounds;
    }

}
