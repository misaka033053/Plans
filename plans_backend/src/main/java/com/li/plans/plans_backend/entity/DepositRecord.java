package com.li.plans.plans_backend.entity;



import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (DepositRecord)实体类
 *
 * @author makejava
 * @since 2023-04-25 14:23:04
 */
@Component
public class DepositRecord implements Serializable {
    private static final long serialVersionUID = 116226448049437068L;
    
    private String recordId;
    
    private String planId;
    
    private Date depositDate;
    
    private Long amount;


    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

}

