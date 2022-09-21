package org.example.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

/**
 * @author tallon
 * @version v1.0.0
 */
public class OfferLoan implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

    @Override
    public void execute(DelegateExecution execution) {
        LOGGER.info("offer " + execution.getVariable("lenderId") + " loans");
    }
}