启动顺序
eureka 7077
Proxy 7078
Hello 7079

验证websocket

http://127.0.0.1:7079/index.html
页面的地址是通过zuul访问，可查看/resources/static/app.js
地址如下：
127.0.0.1:7078/gs-guide-websocket

验证webservice

http://127.0.0.1:7078/Service/hello?wsdl