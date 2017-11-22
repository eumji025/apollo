package com.ctrip.framework.apollo;

import com.ctrip.framework.apollo.foundation.FoundationTest;
import com.ctrip.framework.apollo.foundation.internals.ServiceBootstrapTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ctrip.framework.apollo.core.MetaDomainTest;
import com.ctrip.framework.apollo.foundation.internals.provider.DefaultApplicationProviderTest;
import com.ctrip.framework.apollo.foundation.internals.provider.DefaultServerProviderTest;
import com.ctrip.framework.apollo.tracer.TracerTest;
import com.ctrip.framework.apollo.tracer.internals.DefaultMessageProducerManagerTest;
import com.ctrip.framework.apollo.tracer.internals.NullMessageProducerManagerTest;
import com.ctrip.framework.apollo.tracer.internals.NullMessageProducerTest;

@RunWith(Suite.class)
@SuiteClasses({
    MetaDomainTest.class, ServiceBootstrapTest.class, NullMessageProducerManagerTest.class,
    NullMessageProducerTest.class, DefaultMessageProducerManagerTest.class, TracerTest.class,
    DefaultApplicationProviderTest.class, DefaultServerProviderTest.class, FoundationTest.class})
public class AllTests {

}
