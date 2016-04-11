package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by carlosmorais on 08/04/16.
 */

@WebService
public interface BlackListInterface {
    @WebMethod
    public String isNifOnTheList(String nif);
}
