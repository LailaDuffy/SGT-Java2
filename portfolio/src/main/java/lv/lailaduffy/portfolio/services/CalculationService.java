package lv.lailaduffy.portfolio.services;

import lv.lailaduffy.portfolio.models.SpaceObject;
import org.springframework.stereotype.Service;

/*
Service that will calculate distance between 2 space objects
As well as forces used there
 */
@Service
public class CalculationService {

    public CalculationService() {
    }

    /*
        This method should calculate the distance between 2 space objects
        r^2 = dx^2 + dy^2
         */
    public double calculateDistance(SpaceObject object1, SpaceObject object2) {
        double deltaX = Math.abs(object1.getCoordX() - object2.getCoordX());
        double deltaY = Math.abs(object1.getCoordY() - object2.getCoordY());

        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }
}
