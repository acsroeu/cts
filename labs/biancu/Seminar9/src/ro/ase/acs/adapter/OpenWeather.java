package ro.ase.acs.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//new class
public class OpenWeather {
	private Random random = new Random();
	
	//returns weather for the next days including today
	public List<Integer> getWeather(int numberOfDays) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < numberOfDays; i++) {
			list.add(random.nextInt(30));
		}
		return list;
	}
}
