public class DestinoAlemanha implements Destino{
    public String criaNovaViagem(String nomeDaEmpresa1, String numeroAviao1, String aeroportoDestino1){
        return "Empresa aerea: "  +  nomeDaEmpresa1 +
                ", Destino: Alemanha, Número Avião: " + numeroAviao1 +
                ", Nome Aeroporto de chegada: " + aeroportoDestino1;
    }
}
