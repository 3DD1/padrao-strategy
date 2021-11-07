import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeroportoTest {
    private void assertEquals(String s, String nomeDaEmpresa, String numeroAviao, String aeroportoDestino) {
    }

    @Test
    void deveRetornaDestinoPortugalAeroportoSantaMaria(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaPortugal("Zig Zag",
            "9092-8",
            "Santa Maria Airport");
        assertEquals("Empresa área: Zig Zag, Destino: Portugal, Número Avião: 9092-8, Nome Aeroporto de Chegada: Santa Maria Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }

    @Test
    void deveRetornaDestinoPortugalAeroportoHumebrtoDelgado(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaPortugal("Romeu e Julieta",
                "14597-81",
                "Humberto Delgado Airport");
        assertEquals("Empresa área: Romeu e Julieta, Destino: Portugal, Número Avião: 14597-81, Nome Aeroporto de Chegada: Humberto Delgado Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }



}