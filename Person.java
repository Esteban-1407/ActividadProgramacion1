package encapsulamiento;

public class Person {
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    //EL public hace referencia al modificador de acceso. Este puede ser: public,private and protected
    //Public: Todos pueden ingresar y acceder desde el main(Otra clase)
    //Private: No se puede trabajar desde afuera de la clase de donde se encuentra.
    //Cuando un dato esta en privado, se puede trabajar con Get(obtener) y Set(Cargar) los cuales son metodos publicos.
    //Tambien, una variable en public, se puede acceder con metodos publicos
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
