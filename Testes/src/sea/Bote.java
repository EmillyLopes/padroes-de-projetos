package sea;

public class Bote implements ISeaVehicles {

	@Override
	public void startRoute() {
		getWaves();
		getCargo();
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos as encomendas e os passageiros. Pronto para partir.");
	}

	@Override
	public void getWaves() {
		System.out.println("Verificando as ondas");
	}

}
