package ro.ase.acs.adapter;

import java.util.Arrays;
import java.util.List;

//existing class
public class AccuWeather implements WeatherService {

	@Override
	public int getCurrenteather() {
		return 20;
	}

	@Override
	public List<Integer> getNextSevenDaysForecast() {
		List<Integer> list = Arrays.asList(22, 20, 19, 18, 20, 15, 21);
		return list;
	}
	
}
