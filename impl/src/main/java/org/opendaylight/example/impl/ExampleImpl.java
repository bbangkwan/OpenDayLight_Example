package org.opendaylight.example.impl;

import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.*;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.Future;

/**
 * Created by Bae B K on 2018. 7. 3.
 */
public class ExampleImpl implements ExampleService {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleImpl.class);
    
    
    public ExampleImpl(){
    
    }
    
    @Override
    public Future<RpcResult<RpcTestOutput>> rpcTest(RpcTestInput input) {
        LOG.info(input.getFirstInput());
        
        RpcTestOutputBuilder rpcTestOutputBuilder = new RpcTestOutputBuilder();
        
        rpcTestOutputBuilder.setTestOutput(input.getFirstInput()+" / "+input.getSecondInput());
        
        return RpcResultBuilder.success(rpcTestOutputBuilder.build()).buildFuture();
    }
}
