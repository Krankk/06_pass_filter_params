package ru.neoflex.dev.spring.pass_filter_params.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MyObject {
  //  @JsonProperty("date")
   // @JsonFormat(pattern = "YYYY-MM-DD HH:MM:SS")
    private String  date;

   // @JsonProperty("my_name")
    private String otherValue;

  //  @JsonProperty("very_other_value")
    private String veryOtherValue;

    public MyObject(String date, String my_name, String very_other_value) {
        setDate(date);
        setOtherValue(my_name);
        setVeryOtherValue(very_other_value);
    }


    public String  getDate() {
        return date;
    }

    public String getOtherValue() {
        return otherValue;
    }

    public String getVeryOtherValue() {
        return veryOtherValue;
    }

    public void setDate(String date) {

        this.date = date.replaceAll(" ", "T");
    }

    public void setOtherValue(String otherValue) {
        this.otherValue = otherValue;
    }

    public void setVeryOtherValue(String veryOtherValue) {
        this.veryOtherValue = veryOtherValue;
    }
}

