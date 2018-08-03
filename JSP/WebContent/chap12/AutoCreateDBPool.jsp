<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="org.apache.commons.dbcp.*"%>
<%@page import="org.apache.commons.pool.impl.*"%>
<%!
    public void jspInit() { 
        GenericObjectPool objectPool = new GenericObjectPool();
        DriverManagerConnectionFactory connectionFactory 
                    = new DriverManagerConnectionFactory("jdbc:mysql://localhost:3307/webdb", "root", "1234");
        new PoolableConnectionFactory(connectionFactory, objectPool, null, null, false, true);
        PoolingDriver driver = new PoolingDriver();
        driver.registerPool("/wbdb_pool", objectPool);
    }
%>    