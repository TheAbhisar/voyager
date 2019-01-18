package com.weAssist.components.comtrollers;

import com.weAssist.model.AssistentDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restWeAssist/Assist")

public class AssistentDetailsController {


    @RequestMapping(method = RequestMethod.POST, value = "/seekAssistance")
    public List<AssistentDetails> seekAssistance(
            @RequestParam(value = "myAssistance", required = true) Object myAssistance) {
        AssistentDetails receivweDetails = (AssistentDetails)myAssistance;

        List<AssistentDetails> list = new ArrayList<AssistentDetails>();

        AssistentDetails details = new AssistentDetails();
        details.setUserId(0112);
        details.setAssistentName("anie");
        details.setAssistentWorkType("Hose keeping");
        details.setAssistentRating("5+");
        details.setLatestAvailableTime("1 Hour");
        list.add(details);
        AssistentDetails details1 = new AssistentDetails();
        details1.setUserId(0172);
        details1.setAssistentName("suresh");
        details1.setAssistentWorkType("Hose keeping");
        details1.setAssistentRating("5+");
        details1.setLatestAvailableTime("1 Hour");
        list.add(details1);
        return list;
    }

}
