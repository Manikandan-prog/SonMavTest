package demo02;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.demo.FooService;

import nl.altindag.log.LogCaptor;


public class FooServiceShould {


    @Test

    public void logInfoAndWarnMessages() {

        String expectedInfoMessage = "Keyboard not responding. Press any key to continue...";

        String expectedWarnMessage = "Congratulations, you are pregnant!";


        LogCaptor logCaptor = LogCaptor.forClass(FooService.class);


        FooService fooService = new FooService();

        fooService.sayHello();


        assertThat(logCaptor.getInfoLogs().contains(expectedInfoMessage)).isTrue();

        assertThat(logCaptor.getWarnLogs().contains(expectedWarnMessage)).isTrue();

    }

}
