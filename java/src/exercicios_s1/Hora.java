package exercicios_s1;

public class Hora {
    private Integer hora;
    private Integer min;

    public Hora(Integer hora, Integer min) {
        if(horarioValido(hora,min)) {
            this.hora = hora;
            this.min = min;
        } else {
            System.out.println("Horário inválido");
        }

    }

    public void ajustarHorario(Integer hora, Integer min) {
        if (horarioValido(hora, min)) {
            this.hora = hora;
            this.min = min;
        } else {
            System.out.println("Horário inválido");
        }
    }

    private boolean horarioValido(Integer hora, Integer min) {
        if ((hora < 0 || hora > 23) && (min >= 0 && min <= 59)) return false;
        return true;
    }

    public String imprimirHora() {
        return String.format("%02d:%02d", this.hora, this.min);
    }


}
