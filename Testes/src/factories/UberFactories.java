package factories;

import Air.Airplane;
import Air.IAirVehicles;
import Land.Car;
import Land.ILandVehicles;

public class UberFactories implements ITransportFactory{

	@Override
	public ILandVehicles createTransportVehicles() {
		return new Car();
	}

	@Override
	public IAirVehicles createTransportAir() {
		return new Airplane();
	}

}
