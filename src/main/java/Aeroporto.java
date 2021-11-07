public class Aeroporto {
    private String nomeDaEmpresa;
    private String numeroAviao;
    private String aeroportoDestino;

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public String getNumeroAviao() {
        return numeroAviao;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }


    public void viagemParaPortugal(String nomeDaEmpresa1, String numeroAviao1, String aeroportoDestino1){
        Aviao aviao = new Aviao(nomeDaEmpresa1, numeroAviao1, aeroportoDestino1);
        this.nomeDaEmpresa = aviao.criaNovaViagem(new DestinoPortugal());
        this.numeroAviao = aviao.criaNovaViagem(new DestinoPortugal());
        this.aeroportoDestino = aviao.criaNovaViagem(new DestinoPortugal());
    }

    public void viagemParaAlemanha(String nomeDaEmpresa1, String numeroAviao1, String aeroportoDestino1){
        Aviao aviao = new Aviao(nomeDaEmpresa1, numeroAviao1, aeroportoDestino1);
        this.nomeDaEmpresa = aviao.criaNovaViagem(new DestinoAlemanha());
        this.numeroAviao = aviao.criaNovaViagem(new DestinoAlemanha());
        this.aeroportoDestino = aviao.criaNovaViagem(new DestinoAlemanha());
    }
    public void viagemParaAJapao(String nomeDaEmpresa1, String numeroAviao1, String aeroportoDestino1){
        Aviao aviao = new Aviao(nomeDaEmpresa1, numeroAviao1, aeroportoDestino1);
        this.nomeDaEmpresa = aviao.criaNovaViagem(new DestinoJapao());
        this.numeroAviao = aviao.criaNovaViagem(new DestinoJapao());
        this.aeroportoDestino = aviao.criaNovaViagem(new DestinoJapao());
    }



}
