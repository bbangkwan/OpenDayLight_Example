/*
 * Yoyodyne, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.example.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleProvider implements BindingAwareProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleProvider.class);
    
    private RpcRegistration<ExampleService> exampleServiceRpcRegistration;

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("ExampleProvider Session Initiated");
        
        exampleServiceRpcRegistration = session.addRpcImplementation(ExampleService.class, new ExampleImpl());
    }

    @Override
    public void close() throws Exception {
        LOG.info("ExampleProvider Closed");
    }

}
