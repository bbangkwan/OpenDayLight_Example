package org.opendaylight.example.impl;

import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.ExampleService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.RpcTestInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.RpcTestOutput;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;

/**
 * Created by Bae B K on 2018. 7. 3.
 */
public class ExampleImpl implements ExampleService {
    private RpcProviderRegistry rpcProviderRegistry;
    
    public ExampleImpl(RpcProviderRegistry rpcProviderRegistry){
        this.rpcProviderRegistry = rpcProviderRegistry;
    }
    
    @Override
    public Future<RpcResult<RpcTestOutput>> rpcTest(RpcTestInput input) {
        return null;
    }
}
