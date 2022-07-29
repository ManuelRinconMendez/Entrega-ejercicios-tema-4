public class SmartPhone extends SmartDevice{

    protected int codigoBateria;
    protected boolean bluetooth;
    protected String color;
    protected double tamanio;

    public SmartPhone() {
    }

    public SmartPhone(int codigo, String tipoCarga, String fabricante, int codigoBateria, boolean bluetooth, String color, double tamanio) {
        super(codigo, tipoCarga, fabricante);
        this.codigoBateria = codigoBateria;
        this.bluetooth = bluetooth;
        this.color = color;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "codigoBateria=" + codigoBateria +
                ", bluetooth=" + bluetooth +
                ", color='" + color + '\'' +
                ", tamanio=" + tamanio +
                ", codigo=" + codigo +
                ", tipoCarga='" + tipoCarga + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
