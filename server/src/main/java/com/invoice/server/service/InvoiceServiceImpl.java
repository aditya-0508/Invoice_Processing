package com.invoice.server.service;

import com.invoice.server.dao.InvoiceDao;
import com.invoice.server.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//here implementation of all the services(methods) are done in place
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
       invoiceDao.save(invoice);
       return invoice;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();//will return all the invoices in the database
    }

    @Override
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }
}
