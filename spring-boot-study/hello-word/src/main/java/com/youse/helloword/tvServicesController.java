package com.youse.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@RestController
@RequestMapping("/tvseries")

public class tvServicesController {

    @GetMapping
    public List<TVSeriesDto> getAll(){
        List<TVSeriesDto> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,Calendar.OCTOBER,3);
        list.add(new TVSeriesDto(1,"West Wood",calendar.getTime()));
        return list;
    }

}
