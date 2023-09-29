package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {
    @Test
    void dataBaseMockTest(){
        Database databaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(databaseMock);
        List<String> mockBase = databaseMock.query("sql");

        when(dataProcessor.processData("sql")).thenReturn(mockBase);

        assertEquals(dataProcessor.processData("sql"),mockBase);
    }

}