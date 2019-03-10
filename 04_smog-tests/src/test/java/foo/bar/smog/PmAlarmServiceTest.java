package foo.bar.smog;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PmAlarmServiceTest {
    private PmAlarmService service;

    @BeforeAll
    static void classSetup(){

        Logger.getLogger("JUnit 5").info("Elo \n" + LocalTime.now());
    }

    @AfterAll
    static void classThrowdown() {
        Logger.getLogger("JUnit 5").info("Nara \n" + LocalTime.now());
    }

    @BeforeEach
    void setup() {
        service = new PmAlarmService();
    }

    @Test
    void shouldReturnNoneForMeasurement_10() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_201() {
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(201, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_350() {
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(301, Country.POLAND));
    }
}
