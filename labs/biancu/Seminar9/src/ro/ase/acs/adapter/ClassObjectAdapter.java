package ro.ase.acs.adapter;

import java.util.List;

public class ClassObjectAdapter extends OpenWeather implements WeatherService{

	@Override
	public int getCurrenteather() {
		//returns the first element of the list
		return super.getWeather(1).stream().findFirst().get();
	}

	@Override
	public List<Integer> getNextSevenDaysForecast() {
		List<Integer> list = super.getWeather(8);
		//we delete the first day because it is today
		list.remove(0);
		return list;
	}

}
