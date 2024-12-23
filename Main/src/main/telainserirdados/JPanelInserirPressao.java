package main.telainserirdados;

//Pacotes do Projeto
import main.telainserirdados.abstrato.AbsJPanel;
import main.componentes.LblJLabel;
import main.componentes.TxtJTextField;
//Pacotes Swing
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.KeyEvent;

public class JPanelInserirPressao extends AbsJPanel {

    TxtJTextField txtSistolica = new TxtJTextField("Informe a pressão Sistólica", "");
    TxtJTextField txtDiatolica = new TxtJTextField("Informe a pressão Diastólica", "");
    JCheckBox chkEstado = new JCheckBox("Está estressado no momênto da leitura ?");
    JButton btnAdicionar = new JButton("Adicionar");

    public JPanelInserirPressao(){
        super();
        addComponentes();
    }

    @Override
    public void addComponentes(){
        this.add(new LblJLabel("Pressão Sistólica"), this.getGbc(0,0));
        this.add(this.txtSistolica, this.getGbc(1,0));
        this.add(new LblJLabel("Pressão Diastólica"), this.getGbc(0,1));
        this.add(txtDiatolica, this.getGbc(1,1));
        this.add(this.chkEstado, this.getGbc(0,3));
        this.add(this.btnAdicionar, this.getGbc(0,4));
    }

    @Override
    public void configurarEventoTecla(){
        this.btnAdicionar.setMnemonic(KeyEvent.VK_D);
    }

    public String getTxtSistolica() {
        return txtSistolica.getText();
    }

    public String getTxtDiatolica() {
        return txtDiatolica.getText();
    }

    public boolean getChkEstado() {
        return chkEstado.isSelected();
    }

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }
}
