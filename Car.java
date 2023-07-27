package encapsulamiento;

public class Car {
    private String plate;
    private String color;
    private int model;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
        //el this.plate es obtener el dato de plate que es un dato externo
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
