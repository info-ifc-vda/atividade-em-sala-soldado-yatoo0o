package batalhao;

public class Soldado {
    
    public static int soldados = 0;
    private String nome;
    private int posicao;
    private int posicaoPadrao = 3;
    private String armaPadrao = "Faca de Pao";
    private String arma;
    private int dano;

    public Soldado(String nome){
        this.nome = nome;
        this.posicao = posicao;
        this.arma = arma;
        this.dano = dano;
        soldados++;
    }


    public void movimentar(int distancia){
        System.out.printf("O %s se movimentou " + distancia + " metros.\n", nome);
    }

    public void movimentar(){
        System.out.printf("O %s se movimentou " + posicaoPadrao + " metros.\n", nome);
    }

    public void atacar(String arma){
        if(soldados >= 3){
        System.out.printf("O %s atacou com " + arma + " o inimigo\n", nome);
        }
        else{
            System.out.println("Melhore seu pelotao para atacar\n");
        }
    }

    public void atacar(){
        if(soldados >= 3){
            System.out.printf("O %s atacou com " + armaPadrao + " o inimigo\n", nome);
        }
        else{
            System.out.println("Melhore seu pelotao para atacar\n");
        }
    }

    public boolean causarDano(){
        if(atacar() == true){

        }
    }
}
