package ro.ase.acs.adapter;

import java.util.List;

//existing interface
public interface WeatherService {
	public int getCurrenteather();
	public List<Integer> getNextSevenDaysForecast();
}
