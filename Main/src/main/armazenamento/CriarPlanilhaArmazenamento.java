package main.armazenamento;

//Pacotes Swing
import javax.swing.JOptionPane;
//Pacotes io
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarPlanilhaArmazenamento {

    File dadosLeitura = new File("C:\\Users\\carlo\\OneDrive\\Área de Trabalho\\Estudos\\Senac\\tdas-desen-inter-atividade4\\dadosLeitura.csv");
    Leitura leitura;

    public CriarPlanilhaArmazenamento(Leitura leitura){
        this.leitura = leitura;
        CriarArquivo();
    }

    protected void CriarArquivo(){

        try{
            if(this.dadosLeitura.createNewFile()){

                FileWriter escrever = new FileWriter(this.dadosLeitura);
                escrever.write("Data da leitura,Pressão Sistótilica,Pressão Distólica,Estava estressado");
                escrever.close();
                JOptionPane.showMessageDialog(null, "Arquivo criado");
            }
            else{
                return;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Não foi possível criar o arquivo" + e);
        }
    }

    public void adicionarLeitura(){
        try{
            FileWriter escrever = new FileWriter(this.dadosLeitura, true);
            escrever.write(String.format("%s,%s,%s,%s\n", this.leitura.getDataLeitura(), this.leitura.getPressaoSistolica(), this.leitura.getPressaoDistolica(), this.leitura.getEstaEstressado()));
            escrever.close();
            JOptionPane.showMessageDialog(null, "Valor Inserido com sucesso");
        }catch(IOException erroInserirLinha){
            JOptionPane.showMessageDialog(null, "Não consegui escrever os valores" + erroInserirLinha.getMessage());
        }
    }

}
