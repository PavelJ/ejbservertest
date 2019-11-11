package ejb.client;/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import ejb.remote.RemoteEJBTest;

@Stateless(name = "RemoteEJBTest", description = "Remote EJB test")
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RemoteEJBTestClient implements RemoteEJBTest {

    @Override
    public String callMe(final String input) {
        return "Obtained input: " + input;
    }

}
