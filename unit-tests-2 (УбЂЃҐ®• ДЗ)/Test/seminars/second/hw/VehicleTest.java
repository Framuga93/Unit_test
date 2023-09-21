package seminars.second.hw;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    void setup(){
        car = new Car("Toyota","RAV4",2010);
        motorcycle = new Motorcycle("Honda","cbr400",2008);
    }

    @Test
    void isCarAreVehicleTest(){
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void fourWheelInCarTest(){
        assertEquals(car.getNumWheels(),4);
    }

    @Test
    void twoWheelInMotorcycleTest(){
        assertEquals(motorcycle.getNumWheels(),2);
    }

    @Test
    void speedLimitCarTestDriveTest(){
        car.testDrive();
        assertEquals(car.getSpeed(),60);
    }

    @Test
    void speedLimitMotorcycleTestDriveTest(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(),75);
    }

    @Test
    void carParkingTest(){
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(),0);
    }

    @Test
    void motorcycleParkingTest(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(),0);
    }
}