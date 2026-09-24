package exercicios_aula.moodle;

// Para rodar em conjunto
public class DataHorarioLembreteCompromisso {
    public static void main(String[] args) {
        Data data = new Data(15, 8, 2023);
        Hora hora = new Hora(14, 30);
        Lembrete lembrete = new Lembrete(data, "Reunião com a equipe");
        Compromisso compromisso = new Compromisso("Consulta médica", data, hora);

        System.out.println(lembrete.imprimirLembrete());
        System.out.println(compromisso.imprimirCompromisso());

    }
}
