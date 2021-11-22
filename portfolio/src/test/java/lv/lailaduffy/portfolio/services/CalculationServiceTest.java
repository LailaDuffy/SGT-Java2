package lv.lailaduffy.portfolio.services;

import lv.lailaduffy.portfolio.models.SpaceObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculationServiceTest {

    @Autowired
    CalculationService calculationService;

    @Test
    void calculateDistance() {
        SpaceObject so1 = new SpaceObject();
        SpaceObject so2 = new SpaceObject();

        so1.setCoordX(1);
        so1.setCoordY(1);
        so2.setCoordY(2);
        so2.setCoordX(1);

        assertEquals(calculationService.calculateDistance(so1, so2), 1);
    }
}