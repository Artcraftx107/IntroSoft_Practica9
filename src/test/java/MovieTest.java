import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieTest {

    @Test
    public void shouldThrowExceptionWhenSettingTrailerDurationLongerThan3Minutes() {
        // Arrange
        Movie movie = new Movie();

        // Act and Assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            movie.setTrailerDuration(181); // 181 seconds is longer than 3 minutes
        });

        String expectedMessage = "La duracion del trailer no puede ser mayor a 3 minutos";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}

