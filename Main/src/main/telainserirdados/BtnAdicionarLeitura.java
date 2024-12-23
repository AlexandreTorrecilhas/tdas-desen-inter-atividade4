package main.telainserirdados;

//Pacotes do Projeto
import main.armazenamento.*;
//Pacotes AWT
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
        this.armazenamento = criarArmazenamento(this.dadosInserir);
        this.armazenamento.adicionarLeitura();
    }

    protected Leitura criarLeitura(){
        String dataLeitura = String.format("%s,/,%s,/,%s", jPanelData.getTxtDia(), jPanelData.getTxtMes(), jPanelData.getTxtAno());
        Leitura dados = new Leitura(dataLeitura,jPanelInserirPressao.getTxtSistolica(),jPanelInserirPressao.getTxtDiatolica(),jPanelInserirPressao.getChkEstado());
        return dados;
    }

    protected CriarPlanilhaArmazenamento criarArmazenamento(Leitura dadosInserir){
        CriarPlanilhaArmazenamento armazenamento = new CriarPlanilhaArmazenamento(dadosInserir);
        return armazenamento;
    }

}
