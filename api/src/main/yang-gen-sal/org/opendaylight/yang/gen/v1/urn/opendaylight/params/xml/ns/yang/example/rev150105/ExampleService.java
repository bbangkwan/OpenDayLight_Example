package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module &lt;b&gt;example&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/example.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * rpc rpc-test {
 *     input {
 *         leaf firstInput {
 *             type string;
 *         }
 *         leaf secondInput {
 *             type int32;
 *         }
 *     }
 *     
 *     output {
 *         leaf testOutput {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 *
 */
public interface ExampleService
    extends
    RpcService
{




    Future<RpcResult<RpcTestOutput>> rpcTest(RpcTestInput input);

}

