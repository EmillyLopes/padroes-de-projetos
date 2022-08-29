package Land;

public class Car implements ILandVehicles {

	@Override
	public void startRout() {
		getCargo();
		System.out.println("Iniciando a rota...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os passageiros....");
	}

}
