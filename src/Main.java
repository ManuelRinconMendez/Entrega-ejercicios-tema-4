public class Main {
    public static void main(String[] args) {

        SmartDevice dispositivo = new SmartDevice(1234,"bateria","Acme");
        SmartPhone telefono = new SmartPhone(456,"Electrica","Motorola",75656,
                true,"Blanco",12.5);
        SmartWatch reloj = new SmartWatch(9348, "bateria", "Samsung",
                false, true,"digital");

        System.out.println(dispositivo.toString());
        System.out.println("=======================");
        System.out.println(telefono.toString());
        System.out.println("=======================");
        System.out.println(reloj.toString());

    }
}