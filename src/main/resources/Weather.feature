Feature: Tests are for weather testing

  Scenario: We are getting weather
  When we are requesting weather
  Then LON should be -0.13
  And LAT should be 51.51
