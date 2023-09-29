package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void notificationServiceTestMock(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("Test","Test");

        verify(messageService,times(1)).sendMessage("Test","Test");
    }

}