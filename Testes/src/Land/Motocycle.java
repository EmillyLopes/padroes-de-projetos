package Land;

public class Motocycle implements ILandVehicles {

	@Override
	public void startRout() {
		getCargo();
		System.out.println("Come�ando a rota...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os pacotes...");
	
	}

}
