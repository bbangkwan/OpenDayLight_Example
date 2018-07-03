package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;example&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/example.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container input {
 *     leaf first-input {
 *         type string;
 *     }
 *     leaf second-input {
 *         type int32;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;example/rpc-test/input&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.RpcTestInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.RpcTestInputBuilder
 *
 */
public interface RpcTestInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.rev150105.RpcTestInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:example","2015-01-05","input"));

    java.lang.String getFirstInput();
    
    java.lang.Integer getSecondInput();

}

