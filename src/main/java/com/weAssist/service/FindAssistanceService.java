package com.weAssist.service;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.weAssist.model.LocationResponse;

@Service
public class FindAssistanceService {
	
	
	public LocationResponse getAssistance(){		
		
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();		
				
		String responseString = "{'location': {'lat': '51.0','lng': '-0.1'},'accuracy': '1200.4'}";
		
		JsonObject object = (JsonObject) parser.parse(responseString); // response will be the json String
		LocationResponse locResp = gson.fromJson(object, LocationResponse.class); 		
        
	    	
	    
	    return locResp;		
	}

}
