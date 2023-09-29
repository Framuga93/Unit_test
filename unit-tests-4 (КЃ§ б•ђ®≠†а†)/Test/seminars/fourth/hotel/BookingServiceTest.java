package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void hotelServiceTest() {
        HotelService hotelServiceMock = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceMock);

        when(bookingService.bookRoom(2)).thenReturn(true);

        assertThat(bookingService.bookRoom(2)).isEqualTo(true);
    }

}