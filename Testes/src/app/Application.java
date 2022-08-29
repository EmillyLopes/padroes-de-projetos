package app;

import Air.IAirVehicles;
import Land.ILandVehicles;
import factories.ITransportFactory;

public class Application {

	public IAirVehicles airVehicle;
	public ILandVehicles vehicle;
	
	public Application (ITransportFactory factory){
		vehicle = factory.createTransportVehicles();
		airVehicle = factory.createTransportAir();
	}
	
	public void startRoute(){
		vehicle.startRout();
		airVehicle.startRoute();
	}
}
