package br.com.forgeit.example.domain.service;

import br.com.forgeit.example.domain.port.FeatureBPort;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FeatureBService implements FeatureBPort {

    @Override
    public void execute() {

        MDC.put("featureB", "FEATURE_B_ID");

        log.info("Executing feature B. {}", MDC.getCopyOfContextMap());

    }
}
