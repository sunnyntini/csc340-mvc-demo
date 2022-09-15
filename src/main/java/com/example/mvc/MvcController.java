
package com.example.mvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Sunny Ntini
 */
@Controller
public class MvcController {

    @GetMapping("/hello")
    public String hello(Model model) {
        Greeting greeting = new Greeting("Hello", "World");
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("/universities")
    public String getUniversities(Model model) {
        String url = "http://universities.hipolabs.com/search?name=sports";
        RestTemplate restTemplate = new RestTemplate();
        Object[] universities = restTemplate.getForObject(url, Object[].class);

        JSONArray ja = new JSONArray(universities);

        //Parse out relevant info from each entry in the response
        Iterator<Object> iter = ja.iterator();
        List<University> universityList = new ArrayList<>();
        while (iter.hasNext()) {
            JSONObject jo = (JSONObject) iter.next();
            String name = jo.getString("name");
            String country = jo.getString("country");
            String domain = jo.getJSONArray("domains").getString(0);
            University uni = new University(name, country, domain);
            universityList.add(uni);

        }
        model.addAttribute("universities", universityList);
        return "universities";
    }
}
