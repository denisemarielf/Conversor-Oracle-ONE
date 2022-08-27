package conversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConvertirMonedas monedas = new ConvertirMonedas();
	public void ConvertirMonedas(double valor) {
		String opcion = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
				"Seleccion").toString();

		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.ConvertirPesosADolares(valor);
			break;
		case "De Pesos a Euro":
			monedas.ConvertirPesosAEuros(valor);
			break;
		case "De Pesos a Libras":
			monedas.ConvertirPesosALibrasEsterlinas(valor);
			break;
		case "De Pesos a Yen":
			monedas.ConvertirPesosAYenJapones(valor);
			break;
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosAWonSurCoreano(valor);
			break;
		case "De Dólar a Pesos":
			monedas.ConvertirDolaresAPesos(valor);
			break;
		case "De Euro a Pesos":
			monedas.ConvertirEurosAPesos(valor);
			break;
		case "De Libras a Pesos":
			monedas.ConvertirLibrasEsterlinasAPesos(valor);
			break;
		case "De Yen a Pesos":
			monedas.ConvertirYenJaponesAPesos(valor);
			break;
		case "De Won Coreano a Pesos":
			monedas.ConvertirWonSurCoreanoAPesos(valor);
			break;

		default:
			break;
		}
		
	}
	
	
}
