package com.tobias.saul.bean;

public class Engine {
	
	private String engineSize;
	
	public Engine() {}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Engine [engineSize=" + engineSize + "]";
	}
}
