package Land;

public class Motocycle implements ILandVehicles {

	@Override
	public void startRout() {
		getCargo();
		System.out.println("Comešando a rota...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os pacotes...");
	
	}

}
