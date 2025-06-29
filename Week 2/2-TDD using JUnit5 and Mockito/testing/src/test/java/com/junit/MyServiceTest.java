package com.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testFetch() {
        ExternalAPI a = mock(ExternalAPI.class);
        when(a.getData()).thenReturn("Mock");
        MyService s = new MyService(a);
        String r = s.fetchData();
        assertEquals("Mock", r);
    }

    @Test
    public void testVerifyCall() {
        ExternalAPI a = mock(ExternalAPI.class);
        MyService s = new MyService(a);
        s.fetchData();
        verify(a).getData();
    }
}
