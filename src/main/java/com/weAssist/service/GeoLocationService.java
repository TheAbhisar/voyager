package com.weAssist.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.weAssist.model.LocationResponse;


public class GeoLocationService {
	
	
	public LocationResponse getGeoLocation(){		
		
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();		
		
		Client client = ClientBuilder.newClient();
		WebTarget base = client.target("https://www.googleapis.com/geolocation/v1/geolocate?key=YOUR_API_KEY");
		WebTarget postUrl = base.path("add");
		//Response response = postUrl.request(MediaType.APPLICATION_JSON).post(Entity.json(""));
		
		String responseString = "{'location': {'lat': '51.0','lng': '-0.1'},'accuracy': '1200.4'}";
		
		JsonObject object = (JsonObject) parser.parse(responseString); // response will be the json String
		LocationResponse locResp = gson.fromJson(object, LocationResponse.class); 		
        
	    client.close();	
	    
	    return locResp;		
	}

}
