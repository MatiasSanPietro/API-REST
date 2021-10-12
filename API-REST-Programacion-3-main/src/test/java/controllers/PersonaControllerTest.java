/* package controllers;

import com.example.persona_dos.controllers.PersonaController;
import com.example.persona_dos.entities.Persona;
import com.example.persona_dos.services.PersonaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(PersonaController.class)
class PersonaControllerTest {

    @MockBean
    private PersonaServiceImpl personaService;

    @Test
    void testSearchString() throws Exception {
        Persona persona = new Persona();
        persona.setNombre("Matias");
        persona.setApellido("Pietro");

        List<Persona> ListaEnviada = new ArrayList();
        ListaEnviada.add(persona);


    }
}
 */
