package com.weAssist.components.comtrollers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weAssist.model.AssistentDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restWeAssist/Assist")

public class AssistentDetailsController {


    @RequestMapping(method = RequestMethod.POST, value = "/seekAssistance")
    public List<AssistentDetails> seekAssistance(
            @RequestParam(value = "myAssistance", required = true) Object myAssistance) {

        String myAssistanceStr = myAssistance.toString();
        System.out.println("myAssistanceStr--- "+myAssistanceStr );
        ObjectMapper mapper = new ObjectMapper();
        List<AssistentDetails> list = new ArrayList<AssistentDetails>();
        try {
            AssistentDetails paramDetails = mapper.readValue(myAssistanceStr, AssistentDetails.class);
            if(paramDetails.getAssistentWorkType().equals("") || paramDetails.getAssistentWorkType()== null){
                return new ArrayList<>();
            }
            AssistentDetails details = new AssistentDetails();
            details.setUserId(0112);
            details.setAssistentName("anie");
            details.setAssistentWorkType(paramDetails.getAssistentWorkType());
            details.setAssistentRating(paramDetails.getAssistentRating());
            details.setLatestAvailableTime("30 mins");
            list.add(details);
            AssistentDetails details1 = new AssistentDetails();
            details1.setUserId(0172);
            details1.setAssistentName("suresh");
            details1.setAssistentWorkType(paramDetails.getAssistentWorkType());
            details1.setAssistentRating("5+");
            details1.setLatestAvailableTime("30 mins");
            list.add(details1);
            AssistentDetails details3 = new AssistentDetails();
            details3.setUserId(0172);
            details3.setAssistentName("mahesh");
            details3.setAssistentWorkType(paramDetails.getAssistentWorkType());
            details3.setAssistentRating("4+");
            details3.setLatestAvailableTime("10 mins");
            list.add(details3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

}
