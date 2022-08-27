package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 138.08;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar+" dólares");
	}
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuros = valor / 137.60;
		monedaEuros = (double) Math.round(monedaEuros * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuros+" euros");
	}
	public void ConvertirPesosALibrasEsterlinas(double valor) {
		double monedaLibrasEsterlinas = valor / 162.20;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibrasEsterlinas+" libras esterlinas");
	}
	public void ConvertirPesosAYenJapones(double valor) {
		double monedaYenJapones = valor / 1.00;
		monedaYenJapones = (double) Math.round(monedaYenJapones * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenJapones+" yenes japoneses");
	}
	public void ConvertirPesosAWonSurCoreano(double valor) {
		double monedaWonSurCoreano = valor / 0.10;
		monedaWonSurCoreano = (double) Math.round(monedaWonSurCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonSurCoreano+" won sul coreanos");
	}
	public void ConvertirDolaresAPesos(double valor) {
		double monedaPeso = valor * 138.08;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso+" pesos");
	}
	public void ConvertirEurosAPesos(double valor) {
		double monedaPeso = valor * 137.60;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso+" pesos");
	}
	public void ConvertirLibrasEsterlinasAPesos(double valor) {
		double monedaPeso = valor * 162.20;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso+" pesos");
	}
	public void ConvertirYenJaponesAPesos(double valor) {
		double monedaPeso = valor * 1.00;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso+" pesos");
	}
	public void ConvertirWonSurCoreanoAPesos(double valor) {
		double monedaPeso = valor * 0.10;
		monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso+" pesos");
	}
	
}
