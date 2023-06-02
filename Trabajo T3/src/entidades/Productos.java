/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Hanzel Conislla
 */
public class Productos
        extends Marca
        implements Precio, Talla {

    private int TipoEntrada;

    private final int POLO = 0;
    private final int CAMISETA = 1;
    private final int PANTALON = 2;
    private final int JEAN = 3;
    private final int CORBATA = 4;
    private final int ZAPATILLAS = 5;
    private final int GORRA = 6;
    private final int LENTES = 7;

    @Override
    public String getNombre() {
        String nombreEntrada = "";
        switch(TipoEntrada) {
            case POLO:
                nombreEntrada = "Polo - 60 soles";break;          
            case CAMISETA:
                nombreEntrada = "Camiseta - 70 soles";break;
            case PANTALON:
                nombreEntrada = "Pantalon - 65 soles";break;
            case JEAN:
                nombreEntrada = "Jean - 95 soles";break;
            case CORBATA:
                nombreEntrada = "Corbata - 30 soles";break;
            case ZAPATILLAS:
                nombreEntrada = "Zapatillas - 300 soles";break;
            case GORRA:
                nombreEntrada = "Gorra - 25 soles";break;
            case LENTES:
                nombreEntrada = "Lentes - 20 soles";break;        
        }      
        return "Prenda : " + nombreEntrada;
    }

    /**
     * @return the tipoEntrada
     */
    public int getTipoEntrada() {
        return TipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.TipoEntrada = tipoEntrada;
    }

    @Override
    public void navegar() {

        
    }

    @Override
    public void abrirLink() {

    }

    @Override
    public void reproducir() {

    }

    @Override
    public void adelantar() {

    }

    @Override
    public void retroceder() {

    }

}
