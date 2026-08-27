package exercicios_s1;

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private boolean valida = false;

    public Data(Integer dia, Integer mes, Integer ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.valida = true;
        } else {
            System.out.println("Data inválida");
        }
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

    public void ajustarData(Integer dia, Integer mes, Integer ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.valida = true;
        } else {
            System.out.println("Data inválida");
        }
    }

    public String mostrarData() {
        if (this.valida) {
            return this.dia+"/"+this.mes+"/"+this.ano;
        }
        return "Data inválida";
    }

    public static void main(String[] args) {
        Data data = new Data(29, 2, 2020); // ano bissexto
        System.out.println("Data: " + data.mostrarData()); // 29/2/2020

        data.ajustarData(31, 4, 2021); // abril tem 30 dias
        System.out.println("Data ajustada: " + data.mostrarData()); // não ajusta, mantém a data anterior

        data.ajustarData(30, 4, 2021); // abril tem 30 dias
        System.out.println("Data ajustada: " + data.mostrarData()); // ajusta para 30/4/2021
        // Datas invalidas:
        Data dataInvalida1 = new Data(31, 4, 2021); // abril tem 30 dias
        Data dataInvalida2 = new Data(29, 2, 2021); // 2021 não é bissexto
        Data dataInvalida3 = new Data(32, 1, 2021); // dia inválido
        Data dataInvalida4 = new Data(15, 13, 2021); // mês inválido
        System.out.println("Data inválida 1: " + dataInvalida1.mostrarData());
        System.out.println("Data inválida 2: " + dataInvalida2.mostrarData());
        System.out.println("Data inválida 3: " + dataInvalida3.mostrarData());
        System.out.println("Data inválida 4: " + dataInvalida4.mostrarData());
    }
}
