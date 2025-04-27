package principal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.SwingUtilities;

public class TestPrincipal {
    
    @Test
    public void testPrincipalCriaMenu() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            Principal.main(null); // Executa o método main
            assertNotNull(Principal.menu, "O menu principal não foi inicializado.");
            assertTrue(Principal.menu.isVisible(), "O menu principal não está visível.");
            Principal.menu.dispose(); // Fecha a janela depois do teste
        });
    }
}