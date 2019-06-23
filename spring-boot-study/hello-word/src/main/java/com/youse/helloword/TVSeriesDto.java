package com.youse.helloword;

import java.util.Date;

public class TVSeriesDto {
    private int id;
    private String name;
    private Date seasonDate;


    public TVSeriesDto(){

    }

    public TVSeriesDto(int id,String name,Date seasonDate){
      this.id = id;
      this.name = name;
      this.seasonDate = seasonDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSeasonDate() {
        return seasonDate;
    }

    public void setSeasonDate(Date seasonDate) {
        this.seasonDate = seasonDate;
    }
}


