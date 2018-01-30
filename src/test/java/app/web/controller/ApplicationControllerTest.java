package app.web.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationControllerTest {

    @InjectMocks
    private ApplicationController applicationController;

    @Test
    public void healthEndpointReturnsHealthModel() {
        assertThat(applicationController.getHealth(), is(notNullValue()));
    }

}