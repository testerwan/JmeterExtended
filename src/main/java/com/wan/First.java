package com.wan;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * Created by wan on 2019/5/21.
 */
public class First extends AbstractJavaSamplerClient {

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("Hello Jmeter!");

        return null;
    }
}
