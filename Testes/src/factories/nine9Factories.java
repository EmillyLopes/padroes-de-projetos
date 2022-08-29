package factories;

import Air.Helicopter;
import Air.IAirVehicles;
import Land.ILandVehicles;
import Land.Motocycle;

public class nine9Factories implements ITransportFactory {

	@Override
	public ILandVehicles createTransportVehicles() {
		return new Motocycle();
	}

	@Override
	public IAirVehicles createTransportAir() {
		return new Helicopter();
	}

}
