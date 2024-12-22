package main.componentes;
//Pacotes do Projeto
import main.componentes.abstrato.AbsJTextField;

public class TxtJTextField extends AbsJTextField {

    public TxtJTextField(String dica, String texto){
        super(dica);
        this.setText(texto);
    }

}
