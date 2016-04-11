package com.dhanu.kb.example.chain.base;

public interface BaseContext
{
    String WORK_ITEM = "workItem";
    String WORK_ORDER = "workOrder";
    String WORK_ORDER_SUMMARY = "workOrderSummary";
    String TRANSCODE_ID = "transcodeId";
    String TRANSFER_ID = "transferId";
    String CC_ID = "ccId";
    String QC_ID = "qcId";

    <T> T retrive(String key);
}
