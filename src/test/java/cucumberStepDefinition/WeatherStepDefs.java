package cucumberStepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import model.Response;

import java.io.IOException;
import java.math.BigDecimal;

public class WeatherStepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response = new Response();

    @When("we are requesting weather")
    public void get_weather_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("LON should be (.*)")
        public void check_lon(BigDecimal lon) {
            Assert.assertEquals("Wrong LON: ", lon, response.getCoord().getLon());
        }

    @Then("LAT should be (.*)")
    public void check_lat(BigDecimal lat){
            Assert.assertEquals("Wrong LAT: ", lat, response.getCoord().getLat());
        }

    @Then("WEATHER_CLASS_ID should be (.*)")
    public void check_weather_class_id(Integer weather_class_id) {
        Assert.assertEquals("Wrong WEATHER_CLASS_ID: ", weather_class_id, response.getWeather().get(0).getWeather_class_id());
    }

    @Then("MAIN should be (.*)")
        public void check_main(String main) {
        Assert.assertEquals("Wrong MAIN: ", main, response.getWeather().get(0).getMain());
    }

    @Then("DESCRIPTION should be (.*)")
        public void check_description(String description) {
        Assert.assertEquals("Wrong DESCRIPTION: ", description, response.getWeather().get(0).getDescription());
    }

    @Then("ICON should be (.*)")
    public void check_icon(String icon) {
        Assert.assertEquals("Wrong ICON: ", icon, response.getWeather().get(0).getIcon());
    }

    @Then("ALL should be (.*)")
    public void check_all(Integer all) {
        Assert.assertEquals("Wrong ALL: ", all, response.getClouds().getAll());
    }

    @Then("BASE should be (.*)")
    public void check_base(String base) {
        Assert.assertEquals("Wrong BASE: ", base, response.getBase());
    }

    @Then("TEMP should be (.*)")
    public void check_temp(BigDecimal temp){
        Assert.assertEquals("Wrong TEMP: ", temp, response.getMain().getTemp());
    }

    @Then("PRESSURE should be (.*)")
    public void check_pressure(Integer pressure){
        Assert.assertEquals("Wrong PRESSURE: ", pressure, response.getMain().getPressure());
    }

    @Then("HUMIDITY should be (.*)")
    public void check_humidity(Integer humidity){
        Assert.assertEquals("Wrong HUMIDITY: ", humidity, response.getMain().getHumidity());
    }

    @Then("TEMP_MIN should be (.*)")
    public void check_temp_min(BigDecimal temp_min){
        Assert.assertEquals("Wrong TEMP_MIN: ", temp_min, response.getMain().getTemp_min());
    }

    @Then("TEMP_MAX should be (.*)")
    public void check_temp_max(BigDecimal temp_max){
        Assert.assertEquals("Wrong TEMP_MAX: ", temp_max, response.getMain().getTemp_max());
    }

    @Then("SPEED should be (.*)")
    public void check_speed(Float speed){
        Assert.assertEquals("Wrong SPEED: ", speed, response.getWind().getSpeed());
    }

    @Then("DEG should be (.*)")
    public void check_deg(Integer deg){
        Assert.assertEquals("Wrong DEG: ", deg, response.getWind().getDeg());
    }

    @Then("TYPE should be (.*)")
    public void check_type(Integer type){
        Assert.assertEquals("Wrong TYPE: ", type, response.getSys().getType());
    }

    @Then("SYS_CLASS_ID should be (.*)")
    public void check_sys_class_id(Integer sys_class_id){
        Assert.assertEquals("Wrong SYS_CLASS_ID: ", sys_class_id, response.getSys().getSys_class_id());
    }

    @Then("MESSAGE should be (.*)")
    public void check_message(BigDecimal message){
        Assert.assertEquals("Wrong MESSAGE: ", message, response.getSys().getMessage());
    }

    @Then("COUNTRY should be (.*)")
    public void check_country(String country){
        Assert.assertEquals("Wrong COUNTRY: ", country, response.getSys().getCountry());
    }

    @Then("SUNRISE should be (.*)")
    public void check_sunrise(Integer sunrise){
        Assert.assertEquals("Wrong SUNRISE: ", sunrise, response.getSys().getSunrise());
    }

    @Then("SUNSET should be (.*)")
    public void check_sunset(Integer sunset){
        Assert.assertEquals("Wrong SUNSET: ", sunset, response.getSys().getSunset());
    }

    @Then("VISIBILITY should be (.*)")
    public void check_visibility(String visibility) {
        Assert.assertEquals("Wrong VISIBILITY: ", visibility, response.getVisibility());
    }

    @Then("DT should be (.*)")
    public void check_dt(String dt) {
        Assert.assertEquals("Wrong DT: ", dt, response.getDt());
    }

    @Then("PROPERTY_ID should be (.*)")
    public void check_property_id(String property_id) {
        Assert.assertEquals("Wrong PROPERTY_ID: ", property_id, response.getProperty_id());
    }

    @Then("NAME should be (.*)")
    public void check_name(String name) {
        Assert.assertEquals("Wrong NAME: ", name, response.getName());
    }

    @Then("COD should be (.*)")
    public void check_cod(String cod) {
        Assert.assertEquals("Wrong COD: ", cod, response.getCod());
    }


    }






