package controllers;

import com.example.persona_dos.entities.Persona;
import com.example.persona_dos.repositories.PersonaRepository;
import com.example.persona_dos.services.PersonaServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

class PersonaControllerTest {

    @Mock
    private PersonaRepository personaRepository;

    @Mock
    private PersonaServiceImpl personaService;

    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSearchString() throws Exception {
        Persona persona = new Persona();
        persona.setNombre("Matias");
        persona.setApellido("Pietro");

        List<Persona> listaEnviada = new ArrayList<>();
        listaEnviada.add(persona);

        when(personaRepository.searchNativo("Matias")).thenReturn(listaEnviada);

        assertEquals(listaEnviada, personaService.search("Matias"));

    }
}
