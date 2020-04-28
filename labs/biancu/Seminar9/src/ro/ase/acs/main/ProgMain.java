package ro.ase.acs.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.adapter.AccuWeather;
import ro.ase.acs.adapter.ClassObjectAdapter;
import ro.ase.acs.adapter.ObjectWeatherAdapter;
import ro.ase.acs.adapter.OpenWeather;
import ro.ase.acs.adapter.WeatherService;
import ro.ase.acs.facade.DashboardFacade;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;

public class ProgMain {

	public static void main(String[] args) {
		//Prototype
		StoneBlock block1 = new StoneBlock(0, 0);
		StoneBlock block2 = (StoneBlock)block1.cloneBlock();
		block2.setY(1);
		StoneBlock block3 = (StoneBlock)block2.cloneBlock();
		block3.setX(1);
		block3.setY(0);
		StoneBlock block4 = (StoneBlock)block3.cloneBlock();
		block4.setY(1);
		WoodBlock block5 = new WoodBlock(0, 0, 1);
		WoodBlock block6 = (WoodBlock)block5.cloneBlock();
		block6.setY(1);
		
		List<BuildingBlock> list = new ArrayList<BuildingBlock>();
		list.add(block1);
		//...
		list.add(block6);
		for(BuildingBlock b : list) {
			//render block
			System.out.println(b);
		}
		
		
		//Facade
		DashboardFacade dashboard = new DashboardFacade();
		dashboard.startCar();
		dashboard.accelerate();
		dashboard.turnLeft();
		dashboard.brake();
		dashboard.stopCar();
		
		//Adapter
		
		//old class
		WeatherService service;
		service = new AccuWeather();
		
		//object adapter
		service = new ObjectWeatherAdapter(new OpenWeather());
		
		//class adapter
		service = new ClassObjectAdapter();
		
		System.out.println("Today:");
		System.out.println(service.getCurrenteather());
		
		System.out.println("Forecast:");
		for(Integer temp : service.getNextSevenDaysForecast()) {
			System.out.println(temp);
		}
	}

}
