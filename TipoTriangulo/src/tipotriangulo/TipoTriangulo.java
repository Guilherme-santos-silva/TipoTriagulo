
package tipotriangulo;

import Apresentacao.frmPrincipal;

public class TipoTriangulo {

    public static void main(String[] args) {
        //instanciano nossa classe "frmPrincipal" em "frm"
        frmPrincipal frm = new frmPrincipal(null, true);
        
        //usanod "frm" e "setVisible" para deixar visivel nossa janela grafica
        frm.setVisible(true);
        
        /*o funcinamento do programa consiste em inserir os valores dos 3 lados do triangulo
        com a nossa classe validacao valindando se sao mesmos numeros que vao entrar, nossa classe
        Triangulos identificando o tipo do triangulo e nossa classe Controle fazendo o controle 
        dessas duas classes e mandando para a classe Front*/
    }
    
}
