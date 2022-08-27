package conversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	public void ConvertirTemperatura(double valor) {
		String opcion = JOptionPane.showInputDialog(null, "Elije la unidad de temperatura", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
				"Seleccion").toString();

		switch (opcion) {
		case "De Celsius a Fahrenheit":
			temperatura.ConvertirCelsiusAFahrenheit(valor);
			break;
		case "De Fahrenheit a Celsius":
			temperatura.ConvertirFahrenheitACelsius(valor);
			break;
		
		default:
			break;
		}
		
	}
	
	
}
