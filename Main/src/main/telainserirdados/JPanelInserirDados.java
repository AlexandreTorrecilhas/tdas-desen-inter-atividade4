package main.telainserirdados;

//Pacotes Swing
import javax.swing.BoxLayout;
import javax.swing.JPanel;

class JPanelInserirDados extends JPanel {

    JPanelData jPanelData = new JPanelData();
    JPanelInserirPressao jPanelInserirPressao = new JPanelInserirPressao();

    public JPanelInserirDados(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        addComponentes();
    }

    private void addComponentes(){
        this.add(jPanelData);
        this.add(jPanelInserirPressao);
    }

    public JPanelData getjPanelData() {
        return jPanelData;
    }

    public JPanelInserirPressao getjPanelInserirPressao() {
        return jPanelInserirPressao;
    }
}
