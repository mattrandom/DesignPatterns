package observer.exercise.notification;

import observer.exercise.forecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
