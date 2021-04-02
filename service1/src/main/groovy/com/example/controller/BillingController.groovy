package com.example.controller

import com.example.Service2Client
import com.example.ServiceToClient
import com.example.domain.Book
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Flowable

@Controller("/api/billing")
class BillingController {
    ServiceToClient client

    BillingController(Service2Client client){
        this.client = client
    }

    @Get
    Flowable<ArrayList<Book>> index(){
        client.findBooks()
    }
}
