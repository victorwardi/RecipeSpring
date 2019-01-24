package guru.spring.recipe.recipespring.repository;

import guru.spring.recipe.recipespring.model.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.soap.Addressing;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Victor Wardi - @vwardi on 24/01/2019
 **/

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() throws Exception {

        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", unit.get().getDescription());
    }


}