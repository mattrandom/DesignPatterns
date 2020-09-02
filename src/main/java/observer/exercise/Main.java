package observer.exercise;

import observer.exercise.forecast.WeatherForecast;
import observer.exercise.notification.InternetNews;
import observer.exercise.notification.RadioNews;
import observer.exercise.notification.TvNews;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("New weather forecast - notification only for e-service:");
        weatherForecast.updateInputForecast(18,1007);
    }
}

