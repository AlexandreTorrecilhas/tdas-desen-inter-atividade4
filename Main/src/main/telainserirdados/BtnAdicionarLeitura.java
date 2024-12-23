package main.telainserirdados;

//Pacotes do Projeto
import main.armazenamento.*;
//Pacotes AWT
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BtnAdicionarLeitura implements ActionListener {

    JPanelData jPanelData;
    JPanelInserirPressao jPanelInserirPressao;
    Leitura dadosInserir;
    CriarPlanilhaArmazenamento armazenamento;

    public BtnAdicionarLeitura(JPanelData jPanelData, JPanelInserirPressao jPanelInserirPressao){
        this.jPanelData = jPanelData;
        this.jPanelInserirPressao = jPanelInserirPressao;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        this.dadosInserir = criarLeitura();

        if(!(dadosInserir == null)){
            this.armazenamento = criarArmazenamento(this.dadosInserir);
            this.armazenamento.adicionarLeitura();
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de enviar os dados");
            return;
        }


    }

    protected Leitura criarLeitura(){

        Leitura dados;
        String dataLeitura = String.format("%s/%s/%s", jPanelData.getTxtDia(), jPanelData.getTxtMes(), jPanelData.getTxtAno());
        String sistolica = jPanelInserirPressao.getTxtSistolica();
        String distolica = jPanelInserirPressao.getTxtDiatolica();

        if(!dataLeitura.isEmpty() && !sistolica.isEmpty() && !distolica.isEmpty()){
            dados = new Leitura(dataLeitura,Integer.parseInt(jPanelInserirPressao.getTxtSistolica()),Integer.parseInt(jPanelInserirPressao.getTxtDiatolica()),jPanelInserirPressao.getChkEstado());
            System.out.println("Variavel dataLeitura: " + dataLeitura);
        }
        else{
            dados = null;
        }

        return dados;
    }

    protected CriarPlanilhaArmazenamento criarArmazenamento(Leitura dadosInserir){
        CriarPlanilhaArmazenamento armazenamento = new CriarPlanilhaArmazenamento(dadosInserir);
        return armazenamento;
    }

}
