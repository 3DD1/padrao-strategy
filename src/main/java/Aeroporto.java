public class Aeroporto {
    private String nome;
    private int numeroDoAviao;

    public String getNome() {
        return nome;
    }
    public void viagemParaPortugal(String nome1){
        Aviao aviao = new Aviao(nome1);
        this.nome = aviao.nomeEmpresa(new DestinoPortugal());

    }
}
