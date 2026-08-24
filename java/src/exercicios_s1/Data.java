package exercicios_s1;

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;



    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean dataValida(Integer dia, Integer mes, Integer ano) {
        if (dia > 31 || dia < 0) return false;
        if (mes > 12 || mes < 0) return false;

        final Integer[] mesesValidosCom31 = {1,3,5,7,8,10,12};
        boolean valido = false;
        boolean mesCom31Dias = false;
        if (!mes.equals(2)) {
            for (Integer meses : mesesValidosCom31) {
                if (mes.equals(meses)) {
                    mesCom31Dias = true;
                    break;
                }
            }
            valido = validarDia(dia, mesCom31Dias ? true : false);
        } else {
            if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
                valido = dia <= 29;
            } else {
                valido = dia <= 28;
            }
        }
        return valido;
    }

    private boolean validarDia(Integer dia, boolean mesCom31) {
        if (mesCom31) {
            return dia <= 31;
        } else {
            return dia <= 30;
        }
    }
}
