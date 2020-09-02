package observer.exercise.notification;

import observer.exercise.forecast.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("[Internet-News] Broadcasting a new weather forecast: " +
                "<Temperature> " + weatherForecast.getTemperature() + " degrees Celsius, " +
                "<AtmosphericPressure> " + weatherForecast.getPressure() + " hPa");
    }
}
