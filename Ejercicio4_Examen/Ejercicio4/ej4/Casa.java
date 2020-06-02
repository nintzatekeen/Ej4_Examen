package ej4;

public class Casa {
    private float superficie;
    private String calle;
    private int codigoPostal;
	private String mensajito;
    
    /**
     * Un equipo de limpiadores deja la casa libre de gérmenes
     * y desinfecta todas las superficies
     * */    
    public void limpiarLaCasa() {
        mensajito = "Te hemos limpiado la casa, está desinfectada";
        System.out.println(mensajito);
    }    
}

