package com.ortecfinance.financialplanning;

import com.amazon.speech.speechlet.Session;

import java.io.Serializable;

import static com.ortecfinance.financialplanning.SessionManagementUtil.hasNotBeenStoredInSession;

/**
 * Determines what question still needs to be asked by looking at what answers have already been given (we have already
 * asked questions which have been given an answer)
 */
public class NextQuestionFactory implements Serializable {

    private static final long serialVersionUID = 1L;

    public static String get(Session session) {
        if (hasNotBeenStoredInSession(session, FinancialPlanningSpeechlet.GOAL_AMOUNT_KEY)) {
            return FinancialPlanningSpeechlet.GOAL_AMOUNT_QUESTION;
        } else if (hasNotBeenStoredInSession(session, FinancialPlanningSpeechlet.MONTHLY_CONTRIBUTION_KEY)) {
            return FinancialPlanningSpeechlet.MONTHLY_CONTRIBUTION_QUESTION;
        } else if (hasNotBeenStoredInSession(session, FinancialPlanningSpeechlet.GOAL_PERIOD_KEY)) {
            return FinancialPlanningSpeechlet.GOAL_PERIOD_QUESTION;
        } else {
            return "";
        }
    }

}
