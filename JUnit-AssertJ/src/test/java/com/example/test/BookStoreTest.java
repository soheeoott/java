package com.example.test;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookStoreTest {

    @Test
    public void junitEqualName() {
        BookStore bookStore = new BookStore();
        bookStore.setLocation("Korea");

        MatcherAssert.assertThat(bookStore.getLocation(), Matchers.is("Korea"));
    }

    @Test
    public void assertJEqualName() {
        BookStore bookStore = new BookStore();
        bookStore.setLocation("Korea");

        assertThat(bookStore.getLocation())
                .as("book store location")
                .isEqualTo("Korea");
    }
}