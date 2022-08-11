package br.com.forgeit.example.infra.rest;

import br.com.forgeit.example.domain.port.FeatureAPort;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleController {

    private final FeatureAPort featureAPort;

    @GetMapping("/test")
    public void test() {
        final var requestID = UUID.randomUUID().toString();
        MDC.put("requestID", requestID);

        log.info("Executing controller. {}", MDC.getCopyOfContextMap());

        featureAPort.execute();
    }

}
