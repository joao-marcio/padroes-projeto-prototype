package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(123, "Cliente Original", new CertidaoNascimento("Hospital Monte Sinai", 1) );

        Cliente clienteClone = cliente.clone();
        clienteClone.setMatricula(456);
        clienteClone.setNome("Cliente Clonado");

        assertEquals("Cliente{matricula=123, nome='Cliente Original', certidaoNascimento=CertidaoNascimento{local='Hospital Monte Sinai', matricula=1}}", cliente.toString());
        assertEquals("Cliente{matricula=456, nome='Cliente Clonado', certidaoNascimento=CertidaoNascimento{local='Hospital Monte Sinai', matricula=1}}", clienteClone.toString());
    }
}