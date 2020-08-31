package Modelo;

public class Triangulos extends absPropriedades
{

    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Triangulos(Double l1, Double l2, Double l3) 
    {
        super(l1, l2, l3);
        Verificar();
    }

    //crianod nosso metodo "Verificar" com a função de ferificar qual o tipo do triangulo 
    private void Verificar()
    {
        //definindo o atributo mensagem inicialmente como vazio
        this.setResposta("");
        
        //comecamos a verificar os tipos de triangulos
        if (this.getL1() .equals( this.getL2()) && this.getL2() .equals( this.getL3()))
        {
            //caso lado 1 for igual ao 2 e o lado 2 igual ao 3 entao temos um triangulo rquilatero
            this.setResposta("triangulo equilátero");
        }
        //caso contrario iniciamos o else if
        else if (!this.getL1() .equals( this.getL2())&& !this.getL1() .equals( this.getL3())&& !this.getL2() .equals( this.getL3()))
        {
            //caso o lado 1 for diferente do lado 2 e o lado 1 for diferente do lado 3 e o lado 2 for difernete do lado 3
            //entao temos um trangulo escaleno
            this.setResposta("triangulo escaleno");
        }
        //por fim nosso else
        else 
        {
            //caso os quesitos nao forem atendidos entao temos um triangulo isosceles em que dois lados possuem a mesma medida e 
            //e o ultimo lado tem medida diferente
            this.setResposta("triangulo isósceles");
        }
    }    
}
    
    
     
    

