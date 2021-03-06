package com.github.infrmods.xbus.client;

import com.github.infrmods.xbus.item.ServiceDesc;
import com.github.infrmods.xbus.exceptions.XBusException;
import com.github.infrmods.xbus.item.Service;
import com.github.infrmods.xbus.item.ServiceEndpoint;

/**
 * Created by lolynx on 6/14/16.
 */
interface ServiceClient {
    Service getService(String name, String version) throws XBusException;

    Service watchService(String name, String version) throws XBusException;

    Service watchService(String name, String version, Integer timeout) throws XBusException;

    long plugService(ServiceDesc desc, ServiceEndpoint endpoint) throws XBusException;

    long plugService(ServiceDesc desc, ServiceEndpoint endpoint, Integer ttl) throws XBusException;

    long plugServices(ServiceDesc[] desces, ServiceEndpoint endpoint, Integer ttl) throws XBusException;

    void unplugService(String name, String version) throws XBusException;

    void keepAliveService(String name, String version) throws XBusException;

    void updateServiceConfig(String name, String version, String config) throws XBusException;
}
