package agenda;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class RotinaCerta {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
       
       Compromisso comp = new Compromisso();
       comp.adcComprmisso("Redação","Portugues", "Gerson", "23/06/2021 10:30");
       comp.adcComprmisso("Lista 4","Matematica", "Tamara", "27/06/2021 04:15");
       comp.adcComprmisso("Seminário","Geografia", "Thiago", "28/06/2021 00:17");
       comp.excluirComp(JOptionPane.showInputDialog("Deseja excluir qual compromisso?"));
       comp.lista();
    }
    
}
