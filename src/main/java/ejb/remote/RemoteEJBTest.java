package ejb.remote;

/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

import javax.ejb.Remote;

@Remote
public interface RemoteEJBTest {

    String callMe(String input);

}
