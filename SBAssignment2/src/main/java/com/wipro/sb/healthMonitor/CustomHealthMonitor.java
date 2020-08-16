package com.wipro.sb.healthMonitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthMonitor implements HealthIndicator{

	private static Builder healthBuilder;
	
	@Override
	public Health health() {
		if (healthBuilder==null)
			setHealthBuilder(true);
		else
			setHealthBuilder(false);
		
		return healthBuilder.build();
	}
	
	public String bringApplicationUp() {
		setHealthBuilder(true);
		return null;
	}

	public String bringApplicationDown() {
		setHealthBuilder(false);
		healthBuilder.down().withDetail("SBAsignment2 Application", "Application is facing some issue and currently down.");
		return null;
	}
	
	private void setHealthBuilder(boolean isBringUp) {
		if (healthBuilder==null) 
			healthBuilder = new Builder();
			
		if (isBringUp)
			healthBuilder.up().withDetail("SBAsignment2 Application", "Application is healthy and up and running.");
		
	}

}
