package ro.ase.acs.adapter;

import java.util.List;

public class ObjectWeatherAdapter implements WeatherService {
	private OpenWeather weather;
	
	public ObjectWeatherAdapter(OpenWeather weather) {
		this.weather = weather;
	}
	
	@Override
	public int getCurrenteather() {
		//returns the first element of the list
		return weather.getWeather(1).stream().findFirst().get();
	}

	@Override
	public List<Integer> getNextSevenDaysForecast() {
		List<Integer> list = weather.getWeather(8);
		//we delete the first day because it is today
		list.remove(0);
		return list;
	}
	
}
