
package com.itheima.web;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloService", targetNamespace = "http://web.itheima.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SayHello")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SayHello", targetNamespace = "http://web.itheima.cn/", className = "com.itheima.web.SayHello")
    @ResponseWrapper(localName = "SayHelloResponse", targetNamespace = "http://web.itheima.cn/", className = "com.itheima.web.SayHelloResponse")
    @Action(input = "http://web.itheima.cn/HelloService/SayHelloRequest", output = "http://web.itheima.cn/HelloService/SayHelloResponse")
    public String sayHello();

}
