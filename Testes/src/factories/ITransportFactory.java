package factories;

import Air.IAirVehicles;
import Land.ILandVehicles;
import sea.ISeaVehicles;

public interface ITransportFactory {
	ILandVehicles createTransportVehicles();
	IAirVehicles createTransportAir();
}
