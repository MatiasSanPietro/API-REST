/* package repositories;

import com.example.persona_dos.entities.Persona;
import com.example.persona_dos.repositories.PersonaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@DataJpaTest
class PersonaRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    void testSearchString() {
        Persona persona = new Persona();
        persona.setNombre("Matias");
        persona.setApellido("Pietro");

        List<Persona> ListaEnviada = new ArrayList();
        ListaEnviada.add(persona);

        entityManager.persist(persona);
        entityManager.flush();
        
        Assertions.assertEquals(ListaEnviada, personaRepository.searchNativo("Matias"));
        Assertions.assertEquals(ListaEnviada, personaRepository.searchNativo("Pietro"));


    }

}
 */
