package net.rdrei.android.scdl.api.entity;

import net.rdrei.android.scdl.api.SoundcloudEntity;

public class ResolveEntity implements SoundcloudEntity {
	private static final long serialVersionUID = 1L;

	private String status;
	private String location;

	public String getStatus() {
		return status;
	}

	public String getLocation() {
		return location;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}