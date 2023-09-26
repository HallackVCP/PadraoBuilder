import org.example.Motorista;
import org.example.MotoristaBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class MotoristaBuilderTest {


    @Test
    void deveRetornarExcecaoParaMotoristaSemCnh() {
        try {
            MotoristaBuilder motoristaBuilder = new MotoristaBuilder();
            Motorista motorista = motoristaBuilder
                    .setNome("Motorista 1")
                    .setCpf("1")
                    .setEmail("Motorista1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNH inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMotoristaSemCpf() {
        try {
            MotoristaBuilder motoristaBuilder = new MotoristaBuilder();
            Motorista motorista = motoristaBuilder
                    .setNome("Motorista 1")
                    .setCnh("1")
                    .setEmail("Motorista1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMotoristaSemNome() {
        try {
            MotoristaBuilder motoristaBuilder = new MotoristaBuilder();
            Motorista motorista = motoristaBuilder
                    .setCnh("1")
                    .setCpf("1")
                    .setEmail("Motorista1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarMotoristaValido() {
        MotoristaBuilder MotoristaBuilder = new MotoristaBuilder();
        Motorista Motorista = MotoristaBuilder
                .setCnh("1")
                .setCpf("1")
                .setNome("Motorista 1")
                .setEmail("Motorista1@email.com")
                .build();

        assertNotNull(Motorista);
    }
}
