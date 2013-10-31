sambankaskema
=============

Vefþjónustur fyrir sambankaskema íslenskra banka.

Client er smíðaður með Apache CXF og CXF interceptors notað til að bæta við WSS4J þörfum sbr:

https://cwiki.apache.org/confluence/display/CXF20DOC/WS-Security


    is.netbokhald - kóði til að prófa samskipti á móti Landsbankanum

      Main.java - almennar tilraunir til aflesturs og notkunar rafræns skírteinis af greiðslukorti
  
      NetbokhaldStatementsProxy.java - reikningsyfirlit - demo - hér þarf að setja raunverulega parametra
  
      NetbokhaldClaimsProxy.java - kröfur - demo - hér þarf að setja raunverulega parametra
  
      NetbokhaldPaymentsProxy.java - greiðslur - demo - hér þarf að setja raunverulega parametra
  

    is.netbokhald.li - Apache cxf client kóði út frá WSDL skilgreiningu

      ClientPasswordCallback.java - password handler fyrir client/server handshake, hér þarf að setja user credentials
  

  
