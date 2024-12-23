package main.telainserirdados;

//Pacotes Swing
import javax.swing.JButton;
import javax.swing.JFrame;
//Pacotes AWT
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JFrameTelaInserirDados extends JFrame {
    
    Integer[] coordenadasXY;
    Dimension tamanhoJFrame = new Dimension(700,700);
    JPanelInserirDados inserirDados = new JPanelInserirDados();
    JButton btnAdicionarLeitura = inserirDados.getjPanelInserirPressao().getBtnAdicionar();

    public JFrameTelaInserirDados(){
        setCoordenadasXY();
        this.setLayout(new BorderLayout());
        this.setSize(tamanhoJFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(coordenadasXY[0], coordenadasXY[1]);
        addComponentes();
        addActionListener();
    }

    private void addComponentes(){
        this.add(inserirDados, BorderLayout.CENTER);
    }
    
    private void setCoordenadasXY(){
        this.coordenadasXY = new PosicaoJFrame(this.tamanhoJFrame).getCoordenadasXY();
    }

    private void addActionListener(){
        this.btnAdicionarLeitura.addActionListener(new BtnAdicionarLeitura(this.inserirDados.getjPanelData(), this.inserirDados.getjPanelInserirPressao()));
    }
}
