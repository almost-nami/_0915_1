package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.zerock.config.RootConfig;
import org.zerock.config.WebConfig;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {WebConfig.class, RootConfig.class})
@Log4j
public class HotelTests {

    @Setter(onMethod_ = {@Autowired})
    private SampleHotel hotel;

    @Test
    public void testExist(){
        assertNotNull(hotel);

        log.info(hotel);
        log.info("-----------------------");
        log.info(hotel.getChef());
    }
}
