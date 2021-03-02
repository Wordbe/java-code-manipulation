package co.wordbe.di;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ContainerServiceTest {

    @Test
    public void getObject_BuyRepository() {
        BuyRepository buyRepository = ContainerService.getObject(BuyRepository.class);
        assertNotNull(buyRepository);
    }

    @Test
    public void getObject_BuyService() {
        BuyService buyService = ContainerService.getObject(BuyService.class);
        assertNotNull(buyService);
        assertNotNull(buyService.buyRepository);
    }

}