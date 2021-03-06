package org.traccar.protocol;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class IntellitracProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        IntellitracProtocolDecoder decoder = new IntellitracProtocolDecoder(null);
        decoder.setDataManager(new TestDataManager());

        assertNull(decoder.decode(null, null, "$OK:TRACKING"));

        assertNotNull(decoder.decode(null, null,
                "1010000002,20030217132813,121.646060,25.061725,20,157,133,7,0,11,15,0.096,0.000"));

        assertNotNull(decoder.decode(null, null,
                "1001070919,20130405084206,37.903730,48.011377,0,0,235,10,2,2,0,20.211,0.153"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000002,20030217144230,121.646102,25.061398,0,0,139,0,0,0,0,0.093,0.000"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000004,20050513153524,121.646075,25.063675,0,166,50,6,1,0,0,0.118,0.000"));

        assertNotNull(decoder.decode(null, null,
                "1010000004,20050513154001,121.646075,25.063675,0,166,55,7,1,0,0,0.096,0.000"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        assertNotNull(decoder.decode(null, null,
                "12345,1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        assertNotNull(decoder.decode(null, null,
                "$RP:12345,1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000001,20030105092129,121.651598,25.052325,0,0,33,0,1,0,0"));
        
        assertNotNull(decoder.decode(null, null,
                "1010000001,20030105092129,-121.651598,-25.052325,0,0,33,0,1,0,0"));

    }

}
