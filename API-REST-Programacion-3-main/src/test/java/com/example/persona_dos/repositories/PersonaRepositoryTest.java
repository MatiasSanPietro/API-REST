package com.example.persona_dos.repositories;

import com.example.persona_dos.entities.Persona;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
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
        
        assertEquals(ListaEnviada, personaRepository.searchNativo("Matias"));
        assertEquals(ListaEnviada, personaRepository.searchNativo("Pietro"));


    }

}
