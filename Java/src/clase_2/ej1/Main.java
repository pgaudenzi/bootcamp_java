package clase_2.ej1;

public class Main {

    public static void main(String[] args) {
        CuentaCorriente cuenta3 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(2, 13450.15);
        CuentaCorriente cuenta1 = new CuentaCorriente(new CuentaCorriente(1, 0));

        System.out.println(cuenta1.toString());
        cuenta1.ingreso(1500);

        cuenta2.egreso(3200);
        System.out.println("");
        System.out.println(cuenta2.toString());

        cuenta3.reintegro(1500);
        System.out.println("");
        System.out.println(cuenta3.toString());

        System.out.println("");
        cuenta2.transferencia(3475, cuenta1);
        System.out.println(cuenta2.toString());
        System.out.println(cuenta1.toString());

    }

}
