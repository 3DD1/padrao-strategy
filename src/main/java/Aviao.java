public class Aviao {
    private String idNome;
    /*
    private int idAviao;
*/
    public Aviao(String idNome) {
        this.idNome = idNome;/*
        this.idAviao = idAviao;*/
    }
    public String criaDestino(Destino destino){
        return destino.nomeEmpresa(idNome);
    }
}
