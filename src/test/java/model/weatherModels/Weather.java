package model.weatherModels;

public class Weather {

    private Integer weather_class_id;
    private String main;
    private String description;
    private String icon;

    public Integer getWeather_class_id() {
        return weather_class_id;
    }

    public void setWeather_class_id(Integer weather_class_id) {
        this.weather_class_id = weather_class_id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
