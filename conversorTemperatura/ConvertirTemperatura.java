package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void ConvertirFahrenheitACelsius(double valor) {
		// TODO Auto-generated method stub
		double celsius = (valor - 32) / 1.8;
		celsius = (double) Math.round(celsius * 100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°F son " + celsius + " °C");
	}

	public void ConvertirCelsiusAFahrenheit(double valor) {
		// TODO Auto-generated method stub
		double fahrenheit = (valor * 1.8)+32;
		fahrenheit = (double) Math.round(fahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, valor + "°C son " + fahrenheit + " °F");
		
	}

}
