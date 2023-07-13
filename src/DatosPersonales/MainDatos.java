package DatosPersonales;

public class MainDatos {
    public static void main(String[] args) {
        Datos datos = new Datos();
        datos.age = 17;
        datos.name = "Esteban Salazar Mejia";
        datos.height= 70;
        System.out.println(" Mi nombre es " + datos.name + " Tengo " + datos.age + " años y peso " + datos.height);
}
    }
