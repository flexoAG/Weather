package model.weatherModels;

import java.math.BigDecimal;

public class Sys {

    private Integer type;
    private Integer sys_class_id;
    private BigDecimal message;
    private String country;
    private Integer sunrise;
    private Integer sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSys_class_id() {
        return sys_class_id;
    }

    public void setSys_class_id(Integer sys_class_id) {
        this.sys_class_id = sys_class_id;
    }

    public BigDecimal getMessage() {
        return message;
    }

    public void setMessage(BigDecimal message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }


}



