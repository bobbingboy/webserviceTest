package com.bobbingboy.webservice.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean retreiveSomeBean() {
        return new SomeBean("value1", "v2", "v3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retreiveListOfSomeBean() {
        return Arrays.asList(new SomeBean("value1", "v2", "v3"),
                new SomeBean("v11", "v12", "v13"));
    }
}
