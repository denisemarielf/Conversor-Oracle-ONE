package Principal;

import javax.swing.*;

import conversorMonedas.OpcionesConversion;
import conversorTemperatura.OpcionesTemperatura;

public class Principal {
	public static void main(String args[]) {
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesTemperatura temperatura = new OpcionesTemperatura();
		Boolean corriendo = true;
		while (corriendo) {
			try {
				String opciones = JOptionPane
						.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE,
								null, new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Elegir")
						.toString();

				switch (opciones) {
				case "Conversor de Monedas":
					String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
					try {
						double valorRecibido = Double.parseDouble(input);
						conversion.ConvertirMonedas(valorRecibido);
						int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("");
						} else {
							JOptionPane.showMessageDialog(null, "Conversion finalizada");
							corriendo = false;
						}
					} catch (Exception e) {
						if (e.getMessage() == "empty String") {
							JOptionPane.showMessageDialog(null, "Por favor, inserte sólo números");
						} 
					}

					break;
				case "Conversor de Temperatura":
					String inputGrados = JOptionPane.showInputDialog(null, "Ingrese un valor en grados");
					try {
						double valorRecibidoGrados = Double.parseDouble(inputGrados);
						temperatura.ConvertirTemperatura(valorRecibidoGrados);
						int respuestaGrados = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuestaGrados) {
							System.out.println("");
						} else {
							JOptionPane.showMessageDialog(null, "Conversion finalizada");
							corriendo = false;
						}
					} catch (Exception e) {
						if (e.getMessage() == "empty String") {
							JOptionPane.showMessageDialog(null, "Por favor, inserte sólo números");
						} 
					}

					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Conversion finalizada");
				corriendo = false;
			}
		}
	}
}
