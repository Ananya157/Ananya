package com.example.controller

import com.example.Service2Client
import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable

@Fallback
public class NoCostTicket implements Service2Client{

    @Override
    Flowable<ArrayList<Book>> findBooks() {
        return Flowable.just(new ArrayList<>());
    }
}
