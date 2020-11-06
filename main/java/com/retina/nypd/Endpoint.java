package com.retina.nypd;

import com.opencsv.exceptions.CsvValidationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

@SpringBootApplication
@RestController             /* Request handler */
public class Endpoint {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("dataset/stats/total")
    public Map totalEvents(){

        int total = CSV.numberOfEvents();

        if(total == -1)
            return Collections.singletonMap("error", -1);

        return Collections.singletonMap("total", String.valueOf(total));
    }

    @GetMapping("dataset/stats/offenses")
    public HashMap<String, Integer> totalOffenses(){
        HashMap<String, Integer> offensesList = CSV.getEvent();

        if(offensesList == null){
            offensesList.put("error", -1);
        }

        return offensesList;
    }

    @DeleteMapping("dataset/{id}")
    public boolean deleteEvent(@PathVariable Long id){
        return CSV.deleteOffense(id);
    }

    @RequestMapping(value = "dataset", method = RequestMethod.POST)
    public @ResponseBody Event putEvent(@RequestBody Event jsonString){

        Event event = new Event(jsonString.getCMPLNT_NUM(), jsonString.getKY_CD());

        int retValue = CSV.insertOffense(event);

        if(retValue == -1){
            event.setCMPLNT_NUM("-1");
            event.setKY_CD("-1");
        }
        /*Post example:
        {
            "CMPLNT_NUM": "999999999",
            "KY_CD": "123"
        }
         */

        return event;
    }
}