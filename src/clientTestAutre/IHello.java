
package clientTestAutre;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHello", targetNamespace = "http://soap.ensup.eu/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "response", partName = "response")
    public String ditBonjour(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}