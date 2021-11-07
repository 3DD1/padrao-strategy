public class Aviao {
    private String idNome;
    private String idAviao;
    private String aeroportoDeDestino;

    public Aviao(String idNome, String idAviao, String aeroportoDeDestino) {
        this.idNome = idNome;
        this.idAviao = idAviao;
        this.aeroportoDeDestino = aeroportoDeDestino;
    }

    public String criaNovaViagem(Destino destino){
        return destino.criaNovaViagem(idNome, idAviao, aeroportoDeDestino);
    }
}
