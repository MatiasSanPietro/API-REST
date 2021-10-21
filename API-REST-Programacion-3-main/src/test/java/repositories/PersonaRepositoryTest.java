package repositories;

import com.example.persona_dos.entities.Persona;
import com.example.persona_dos.repositories.PersonaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonaRepositoryTest {

    @Mock
    private EntityManager entityManager;

    @Mock
    private PersonaRepository personaRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSearchString() {
        Persona persona = new Persona();
        persona.setNombre("Matias");
        persona.setApellido("Pietro");

        List<Persona> ListaEnviada = new ArrayList();
        ListaEnviada.add(persona);

        entityManager.persist(persona);
        entityManager.flush();
        
        assertEquals(ListaEnviada, personaRepository.searchNativo("Matias"));
        assertEquals(ListaEnviada, personaRepository.searchNativo("Pietro"));


    }

}
