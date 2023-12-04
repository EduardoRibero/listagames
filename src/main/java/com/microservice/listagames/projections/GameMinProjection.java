package com.microservice.listagames.projections;

public interface GameMinProjection {
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer gerPosition();
}
