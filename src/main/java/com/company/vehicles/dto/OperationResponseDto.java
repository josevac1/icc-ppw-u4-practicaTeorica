package com.company.vehicles.dto;

public class OperationResponseDto {
    private boolean success;
    private String message;
    private boolean conflict;

    public OperationResponseDto() {
    }

    public OperationResponseDto(boolean success, String message) {
        this.success = success;
        this.message = message;
        this.conflict = false;
    }

    public OperationResponseDto(boolean success, String message, boolean conflict) {
        this.success = success;
        this.message = message;
        this.conflict = conflict;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isConflict() {
        return conflict;
    }

    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }
}
