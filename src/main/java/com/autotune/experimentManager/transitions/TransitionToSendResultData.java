package com.autotune.experimentManager.transitions;

import com.autotune.experimentManager.core.EMIterationManager;
import com.autotune.experimentManager.core.EMTransitionRegistry;
import com.autotune.experimentManager.data.EMMapper;
import com.autotune.experimentManager.data.ExperimentTrialData;
import com.autotune.experimentManager.utils.EMUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransitionToSendResultData extends AbstractBaseTransition{
    private static final Logger LOGGER = LoggerFactory.getLogger(TransitionToSendResultData.class);
    @Override
    public void transit(String runId) {
        LOGGER.info("Executing transition - TransitionToSendResultData on thread - {}", Thread.currentThread().getId());
        System.out.println("Executing transition - TransitionToSendResultData on thread - {}" + Thread.currentThread().getId() + "For RunId - " + runId);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        processNextTransition(runId);
    }
}
