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
        assertEquals("Empresa aerea: Zig Zag, Destino: Portugal, Número Avião: 9092-8, Nome Aeroporto de Chegada: Santa Maria Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }

    @Test
    void deveRetornaDestinoPortugalAeroportoHumebrtoDelgado(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaPortugal("Romeu e Julieta",
                "14597-81",
                "Humberto Delgado Airport");
        assertEquals("Empresa aerea: Romeu e Julieta, Destino: Portugal, Número Avião: 14597-81, Nome Aeroporto de Chegada: Humberto Delgado Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }

    @Test
    void deveRetornaDestinoAlemanhaAeroportoMunique(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaAlemanha("Oktoberfest",
                "45-0",
                "Munique Airport");
        assertEquals("Empresa aerea: Oktoberfest, Destino: Alemanha, Número Avião: 45-0, Nome Aeroporto de Chegada: Munique Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }

    @Test
    void deveRetornaDestinoJapaoAeroportoNaritaInternational(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaAlemanha("Naruto",
                "4745-89",
                "Narita International Airport");
        assertEquals("Empresa aerea: Naruto, Destino: Japão, Número Avião: 4745-89, Nome Aeroporto de Chegada: Narita International Airport", aeroporto.getNomeDaEmpresa(), aeroporto.getNumeroAviao(), aeroporto.getAeroportoDestino());
    }


}