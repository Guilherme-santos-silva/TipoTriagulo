
package Modelo;

public class Validacao extends absPropriedades 
{

    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Validacao(String lado1, String lado2, String lado3) {
        super(lado1, lado2, lado3);
        Validar();
    }

    
    //crianod nosso metodo "Validar" com a função de validar se foram inseridos numeros e se 
    //os numeros inseridos podem ser de um triangulo
    private void Validar()
    {
        //definindo o atributo mensagem inicialmente como vazio
        this.setMensagem("");
        try 
        {
            //passando os dados inseridos de String para Double
            this.setL1(Double.parseDouble(this.getLado1()));
            this.setL2(Double.parseDouble(this.getLado2()));
            this.setL3(Double.parseDouble(this.getLado3()));
            
            //fazendo a verificacação se os numeros inseridos sao de um triangulo
            if (getL1() + getL2() <= getL3() ||
                getL2() + getL3() <= getL1() || 
                getL1() + getL3() <= getL2())
            {
                this.setMensagem("estes lados nao pertencem a um triangulo");
            }
        } 
        catch (Exception e) 
        {
            this.setMensagem("erro de converção");
        }
        
        
        
    
    }
    
}
