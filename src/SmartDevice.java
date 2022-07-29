public class SmartDevice {

    protected int codigo;
    protected String tipoCarga;
    protected String fabricante;

    public SmartDevice() {

    }
    public SmartDevice(int codigo, String tipoCarga, String fabricante) {
        this.codigo = codigo;
        this.tipoCarga = tipoCarga;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "codigo=" + codigo +
                ", tipoCarga='" + tipoCarga + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
