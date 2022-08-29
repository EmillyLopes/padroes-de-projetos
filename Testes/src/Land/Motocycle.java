package Land;

public class Motocycle implements ILandVehicles {

	@Override
	public void startRout() {
		getCargo();
		System.out.println("Começando a rota...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os pacotes...");
	
	}

}
