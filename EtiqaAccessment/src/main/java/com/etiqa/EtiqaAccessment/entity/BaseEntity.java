package com.etiqa.EtiqaAccessment.entity;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@jakarta.persistence.MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 3322016140341487055L;

	/**
	 * 
	 */


	   @Column(name="created_by")
	    private String createdBy;

	    @Column(name="created_date")
	    private String createdDate;

	    @Column(name="updated_by")
	    private String updatedBy;

	    @Column(name="updated_date")
	    private String updatedDate;


    @PrePersist
    public void setInsertedDefault(){
        if(this.createdDate == null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("IST"));
            this.createdDate = sdf.format(new java.sql.Date(new Date().getTime()));
            this.createdBy ="SYSTEM";
        }
    }

    @PreUpdate
    public void setUpdatedDefault(){
        if(this.updatedDate == null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("IST"));
            this.updatedDate = sdf.format(new java.sql.Date(new Date().getTime()));
            this.updatedBy ="SYSTEM";
        }
    }

}