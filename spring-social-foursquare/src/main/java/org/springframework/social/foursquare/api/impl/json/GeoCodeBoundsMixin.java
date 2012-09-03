package org.springframework.social.foursquare.api.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.foursquare.api.FoursquareUser;
import org.springframework.social.foursquare.api.GeoCodeBounds;
import org.springframework.social.foursquare.api.GeoCodeFeature;
import org.springframework.social.foursquare.api.GeoCodeGeoPt;
import org.springframework.social.foursquare.api.Venue;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class GeoCodeBoundsMixin {
	@JsonCreator
	GeoCodeBoundsMixin(
			@JsonProperty("ne") GeoCodeGeoPt ne,
			@JsonProperty("sw") GeoCodeGeoPt sw){}
}
