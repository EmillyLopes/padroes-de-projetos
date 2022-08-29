import app.Application;
import factories.ITransportFactory;
import factories.UberFactories;
import factories.nine9Factories;

public class Main {
		
	public static void main(String[] args) {
		Application app = configureApplication();
		app.startRoute();
	}
	
	public static Application configureApplication() {
		Application app;
		ITransportFactory factory;
		
		String company = "Uber";
		
		if(company.equals("99")){
			factory =  new UberFactories();
		}else{
			factory = new nine9Factories();
		}
		
		app = new Application(factory);
		return app;
	}
}
