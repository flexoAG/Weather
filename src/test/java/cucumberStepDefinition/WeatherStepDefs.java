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
    }

