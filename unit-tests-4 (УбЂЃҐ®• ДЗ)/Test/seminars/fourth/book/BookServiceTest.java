package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void findBookByIdTest() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1","TestT","TestA"));
        BookService bookService  = new BookService(bookRepositoryMock);

        assertEquals("TestA", bookService.findBookById("1").getAuthor());
        assertEquals("TestT", bookService.findBookById("1").getTitle());
    }

    @Test
    void findAllBooks() {
        BookRepository bookRepositoryMock = mock(BookRepository.class);

        when(bookRepositoryMock.findAll()).thenReturn(List.of(new Book("1","TestT","TestA")));
        BookService bookService  = new BookService(bookRepositoryMock);

        assertEquals(1, bookService.findAllBooks().size());
        assertEquals("TestA", bookService.findAllBooks().get(0).getAuthor());
        assertEquals("TestT", bookService.findAllBooks().get(0).getTitle());
    }
}