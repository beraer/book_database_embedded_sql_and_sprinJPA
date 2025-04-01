package myproject.s29315tpo04books.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToMany(mappedBy = "authorList", fetch = FetchType.EAGER)
    private List<Book> bookList = new ArrayList<>();

    public Author(String firstName, String lastName, List<Book> bookList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookList = bookList;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
