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

                JOptionPane.showMessageDialog(null, "Arquivo criado");
                FileWriter escrever = new FileWriter(dadosLeitura);
                escrever.append("Data da leitura,Pressão Sistótilica,Pressão Distólica,Estava estressado");
                escrever.close();
            }
            else{
                return;
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Não foi possível criar o arquivo" + e);
        }
    }

    protected void adicionarLeitura(){
        try{
            FileWriter escrever = new FileWriter(this.dadosLeitura);
            escrever.append(String.format("%s,%s,%s,%s\n", this.leitura.getDataLeitura(), this.leitura.getPressaoSistolica(), this.leitura.getPressaoDistolica(), this.leitura.getEstaEstressado()));
            JOptionPane.showMessageDialog(null, "Valor Inserido com sucesso");
            JOptionPane.showMessageDialog(null, "Valor Inserido com sucesso");
        }catch(IOException erroInserirLinha){
            JOptionPane.showMessageDialog(null, "Não consegui escrever os valores" + erroInserirLinha.getMessage());
        }
    }

}
