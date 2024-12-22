package main.armazenamento;

//Pacotes Swing
import javax.swing.JOptionPane;
//Pacotes Time
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Leitura {

    DateTimeFormatter dataModelo = DateTimeFormatter.ofPattern("DD/MM/YYYY");

    LocalDate dataLeitura;
    int pressaoSistolica;
    int pressaoDistolica;
    boolean estaEstressado;

    public Leitura(String dataLeitura, int pressaoSistolica, int pressaoDistolica, boolean estaEstressado){
        try{
            this.dataLeitura = LocalDate.parse(dataLeitura, this.dataModelo);
            this.pressaoSistolica = pressaoSistolica;
            this.pressaoDistolica = pressaoDistolica;
            this.estaEstressado = estaEstressado;
        }catch(DateTimeParseException dateErro){
            System.out.println(dateErro);
        }finally{
            JOptionPane.showMessageDialog(null, "Por favor, verificar a data informada");
        }
    }

    public String getDataLeitura() {

        return dataLeitura.toString();
    }

    public String getPressaoSistolica() {
        return Integer.toString(pressaoSistolica);
    }

    public String getPressaoDistolica() {
        return Integer.toString(pressaoDistolica);
    }

    public String getEstaEstressado() {
        return Boolean.toString(estaEstressado);
    }
}
