package main.telainserirdados;

//Pacotes Swing
import javax.swing.JFrame;
//Pacotes AWT
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JFrameTelaInserirDados extends JFrame {
    
    Integer[] coordenadasXY;
    Dimension tamanhoJFrame = new Dimension(700,700);
    JPanelInserirDados inserirDados = new JPanelInserirDados();

    public JFrameTelaInserirDados(){
        setCoordenadasXY();
        this.setLayout(new BorderLayout());
        this.setSize(tamanhoJFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(coordenadasXY[0], coordenadasXY[1]);
        addComponentes();
    }

    private void addComponentes(){
        this.add(inserirDados, BorderLayout.CENTER);
    }
    
    private void setCoordenadasXY(){
        this.coordenadasXY = new PosicaoJFrame(this.tamanhoJFrame).getCoordenadasXY();
    }
}
