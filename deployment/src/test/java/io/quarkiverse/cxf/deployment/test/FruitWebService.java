package io.quarkiverse.cxf.deployment.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

@WebService
public interface FruitWebService {

    @WebMethod
    @WebResult(name = "countFruitsResponse", targetNamespace = "http://test.deployment.cxf.quarkiverse.io/", partName = "parameters")
    int count();

    @WebMethod
    @RequestWrapper(localName = "Add", targetNamespace = "http://test.deployment.cxf.quarkiverse.io/", className = "io.quarkiverse.cxf.deployment.test.Add")
    void add(@WebParam(name = "fruit") Fruit fruit);

    @WebMethod
    void delete(@WebParam(name = "fruit") Fruit fruit);
}
