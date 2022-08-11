package br.com.forgeit.example.domain.service;

import br.com.forgeit.example.domain.port.FeatureAPort;
import br.com.forgeit.example.domain.port.FeatureBPort;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeatureAService implements FeatureAPort {

    private final FeatureBPort featureBPort;

    @Override
    public void execute() {

        MDC.put("featureA", "FEATURE_A_ID");

        log.info("Executing feature A. {}", MDC.getCopyOfContextMap());

        featureBPort.execute();


    }
}
