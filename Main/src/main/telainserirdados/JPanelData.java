package main.telainserirdados;

//Pacotes do Projeto
import main.componentes.LblJLabel;
import main.componentes.TxtJTextField;
import main.telainserirdados.abstrato.AbsJPanel;
//Pacotes AWT
import java.awt.event.KeyEvent;
//Pacotes Time
import java.time.LocalDate;

class JPanelData extends AbsJPanel {

    LocalDate dia = LocalDate.now();

    LblJLabel lblDia = new LblJLabel("Dia");
    TxtJTextField txtDia = new TxtJTextField("Informe o dia em que a medição foi realizada",Integer.toString(dia.getDayOfMonth()));
    LblJLabel lblMes = new LblJLabel("Mês");
    TxtJTextField txtMes = new TxtJTextField("Informe o mês em que a medição foi realizada",Integer.toString(dia.getMonthValue()));
    LblJLabel lblAno = new LblJLabel("Ano");
    TxtJTextField txtAno = new TxtJTextField("Informe o ano em que a medição foi realizada",Integer.toString(dia.getYear()));

    public JPanelData(){
        super();
        addComponentes();
    }

    @Override
    public void addComponentes(){
        this.add(lblDia, this.getGbc(0,0));
        this.add(txtDia, this.getGbc(1,0));
        this.add(this.lblMes, this.getGbc(0,1));
        this.add(this.txtMes, this.getGbc(1,1));
        this.add(this.lblAno, this.getGbc(0,2));
        this.add(this.txtAno, this.getGbc(1,2));
    }

    @Override
    public void configurarEventoTecla(){

    }

    public String getTxtDia() {
        return txtDia.getText();
    }

    public String getTxtMes() {
        return txtMes.getText();
    }

    public String getTxtAno() {
        return txtAno.getText();
    }
}
