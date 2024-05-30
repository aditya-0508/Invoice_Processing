package com.invoice.server.service;

import com.invoice.server.model.Invoice;

import java.util.List;

public interface InvoiceService {

    //here we are creating all the abtsract of the methods which are been used up
    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();

    public Invoice deleteInvoice(long id);
}
