package Modelo;

public class Controle extends absPropriedades 
{

    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        Verificar();
    }

    //crianod nosso metodo "Verificar" com a função e controlar o funcionamentos das classe "Validacao" e "Triangulos"
    private void Verificar ()
    {
        //definindo o atributo mensagem inicialmente como vazio
        this.setMensagem("");
        
        //instanciamos nossa classe "Validacao" e pegamos Lado1(), Lado2() e Lado3() que vem dela, usamos get para ter acesso ao valor
        Validacao validacao = new Validacao(getLado1(), getLado2(), getLado3());
        
        //inicimoas nosso controle com if e validamos se o atributo mensagem estiver vazio
        if(validacao.getMensagem().equals(""))
                
        {
            //instanciamos a classe "Triangulos" que pega os dados vindos da classe "Validacao"
            Triangulos trinagulos = new Triangulos(validacao.getL1(), validacao.getL2(), validacao.getL3()); /*pegando de validacao*/
            
            //e setamos nosso atributo resposta pegando os dados de "trinagulos.getResposta()", para podermos exibilo
            this.setMensagem(trinagulos.getResposta());
            
        }
        else 
        {
            //casso nosso atributo mensagem nao estiver vazio entao o exibimos 
            this.setMensagem(validacao.getMensagem());
        }
        
    }
}
