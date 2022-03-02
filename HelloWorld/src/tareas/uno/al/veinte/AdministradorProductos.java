package tareas.uno.al.veinte;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AdministradorProductos
{
	public static void main(String[] args)
	{
		int opcion_indice = 0;

		Map<String, Integer> opciones = new HashMap()
		{{
			put("Actualizar", 1);
			put("Eliminar", 2);
			put("Agregar", 3);
			put("Listar", 4);
			put("Salir", 5);
		}};

		Object[] op_arreglo = opciones.keySet().toArray();
		Object opcion;

		do
		{
			opcion = JOptionPane.showInputDialog(null,
					"Seleccione una opción",
					"Mantendor de productos",
					JOptionPane.INFORMATION_MESSAGE,
					null,
					op_arreglo,
					op_arreglo[0]);

			if (opcion == null)
			{
				JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
			} else
			{
				opcion_indice = opciones.get(opcion.toString());

				JOptionPane.showMessageDialog(null, switch (opcion_indice)
						{
							case 1 -> "Usuario actualizado correctamente";
							case 2 -> "Usuario eliminado correctamente";
							case 3 -> "Usuario agregado correctamente";
							case 4 -> "Usuario listado correctamente";
							case 5 -> "Has salido con éxito";
							default -> "";
						});
			}
		} while (opcion_indice != 5);
	}
}
