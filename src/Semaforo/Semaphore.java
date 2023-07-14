package Semaforo;

public class Semaphore {
    public String color;
    public boolean state;
    public String mostrarEstado() {
        if (state) {
            return "semaforo encendido";
        } else {
            return " semaforo apagado";
        }
    }
        public String mosntrarMensaje(){
            if(color.equals("verde")){
                return "Siga papi";

            } else if (color.equals("amarillo")) {
                return "Preparese";

            }else if (color.equals("rojo")){
                return "Pare rey";
            }else {
                return "No esta en servicio";
            }
        }
    }


