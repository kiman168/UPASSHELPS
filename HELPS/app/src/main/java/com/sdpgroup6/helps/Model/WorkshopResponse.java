package com.sdpgroup6.helps.Model;

import java.util.ArrayList;
import java.util.List;

public class WorkshopResponse {

    private List<Workshop> results = new ArrayList<Workshop>();
    private Boolean isSuccess;
    private Object displayMessage;

    /**
     * @return The results
     */
    public List<Workshop> getWorkshops() {
        return results;
    }

    /**
     * @param results The Workshops
     */
    public void setWorkshops(List<Workshop> results) {
        this.results = results;
    }

    /**
     * @return The isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * @param isSuccess The IsSuccess
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * @return The displayMessage
     */
    public Object getDisplayMessage() {
        return displayMessage;
    }

    /**
     * @param displayMessage The DisplayMessage
     */
    public void setDisplayMessage(Object displayMessage) {
        this.displayMessage = displayMessage;
    }

}