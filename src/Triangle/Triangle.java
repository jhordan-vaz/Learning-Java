package Triangle;

// O prefixo "PUBLIC" significa que o atributo/método pode ser usado em outros arquivos
public class Triangle {
    //atributos da classe
    public double a;
    public double b;
    public double c;

    // tipo de dado |Nome do metodo|
    public double area(){
        //lista de parâmetros do método
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
