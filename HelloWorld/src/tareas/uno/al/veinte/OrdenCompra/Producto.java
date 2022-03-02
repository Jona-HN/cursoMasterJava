package tareas.uno.al.veinte.OrdenCompra;

// Le cambié un poquito al requerimiento de la tarea original
// para practicar los enums
public enum Producto
{
	MARTILLO("Truper","Martillo", 44.99f),
	DESARMADOR("Stanley", "Desarmador", 24.99f),
	TALADRO("DeWalt", "Taladro", 1499.99f),
	PINZAS("Makita", "Pinzas", 39.99f),
	BUFFER("Skil", "Buffer (esmeril)", 1999.99f),
	CINTA_METRICA("Black+Decker", "Cinta métrica", 49.99f),
	SIERRA_CIRCULAR("Bosch", "Sierra circular", 2499.99f),
	SERRUCHO("Fischer", "Serrucho", 199.99f),
	ESCUADRA("3M", "Escuadra", 49.99f),
	NIVEL("Klein Tools", "Nivel", 299.99f),
	LLAVE("Hikoki", "Llave Inglesa", 99.99f),
	VERNIER("ULINE", "Vernier (pie de rey)", 1999.99f);


	private final String fabricante;
	private final String nombre;
	private final float precio;

	Producto(String fabricante, String nombre, float precio)
	{
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getFabricante()
	{
		return fabricante;
	}

	public String getNombre()
	{
		return nombre;
	}

	public float getPrecio()
	{
		return precio;
	}

	@Override
	public String toString()
	{
		return nombre + " marca " + fabricante + " ($" + precio + ")";
	}
}
