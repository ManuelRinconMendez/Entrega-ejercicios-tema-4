public class SmartWatch extends SmartDevice{

    protected boolean serviciosAdicionales;
    protected boolean gps;
    protected String tipoReloj;

    public SmartWatch() {

    }

    public SmartWatch(int codigo, String tipoCarga, String fabricante, boolean serviciosAdicionales, boolean gps, String tipoReloj) {
        super(codigo, tipoCarga, fabricante);
        this.serviciosAdicionales = serviciosAdicionales;
        this.gps = gps;
        this.tipoReloj = tipoReloj;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "serviciosAdicionales=" + serviciosAdicionales +
                ", gps=" + gps +
                ", tipoReloj='" + tipoReloj + '\'' +
                ", codigo=" + codigo +
                ", tipoCarga='" + tipoCarga + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
