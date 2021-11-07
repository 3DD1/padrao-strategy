import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeroportoTest {

    @Test
    void deveRetornaDestinoPortugal(){
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.viagemParaPortugal("Zig Zag");
        assertEquals("Empresa área: Zig Zag Destino: Portugal", aeroporto.getNome());
    }

}