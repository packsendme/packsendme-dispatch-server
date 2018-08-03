package com.packsendme.microservice.dispatch.model;

import java.io.Serializable;
import java.util.Date;

public class Dispatch implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String userName;

	private String nameDestination;

	private String collectedFrom;
	
	private String deliveredTo;
	
	private String transportType;
	
	private Date dateSubmission;

	private String cost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameDestination() {
		return nameDestination;
	}

	public void setNameDestination(String nameDestination) {
		this.nameDestination = nameDestination;
	}

	public String getCollectedFrom() {
		return collectedFrom;
	}

	public void setCollectedFrom(String collectedFrom) {
		this.collectedFrom = collectedFrom;
	}

	public String getDeliveredTo() {
		return deliveredTo;
	}

	public void setDeliveredTo(String deliveredTo) {
		this.deliveredTo = deliveredTo;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Date getDateSubmission() {
		return dateSubmission;
	}

	public void setDateSubmission(Date dateSubmission) {
		this.dateSubmission = dateSubmission;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
