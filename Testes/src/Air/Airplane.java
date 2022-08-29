package Air;

public class Airplane implements IAirVehicles{

	@Override
	public void startRoute() {
		getWind();
		getCargo();
		System.out.println("Começando o trajeto...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os passageiros e as encomendas...");
	}

	@Override
	public void getWind() {
		System.out.println("Verificando a força dos ventos...\nVento OK!");
	}
	
	
}
