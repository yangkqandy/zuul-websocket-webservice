package com.github.anchnet.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;


@RestController
public class HelloController {

    @RequestMapping(value="/cxftest",method = RequestMethod.GET)
    public String cxfTest(){
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:7079/Service/hello?wsdl");
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("hello_world", "zhangsan123456");
            System.out.println("返回数据:" + objects[0]);
            client.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user index";
    }
}
