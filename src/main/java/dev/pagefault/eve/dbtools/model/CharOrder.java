package dev.pagefault.eve.dbtools.model;

import java.sql.Timestamp;

public class CharOrder {

	private Timestamp issued;
	private String range;
	private boolean buyOrder;
	private int duration;
	private long orderId;
	private int volumeRemain;
	private int minVolume;
	private int typeId;
	private int volumeTotal;
	private long locationId;
	private double price;
	private int region;
	private Timestamp retrieved;
	private int charId;

	public CharOrder() {
	}

	public Timestamp getIssued() {
		return issued;
	}

	public void setIssued(Timestamp issued) {
		this.issued = issued;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public boolean isBuyOrder() {
		return buyOrder;
	}

	public void setBuyOrder(boolean buyOrder) {
		this.buyOrder = buyOrder;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getVolumeRemain() {
		return volumeRemain;
	}

	public void setVolumeRemain(int volumeRemain) {
		this.volumeRemain = volumeRemain;
	}

	public int getMinVolume() {
		return minVolume;
	}

	public void setMinVolume(int minVolume) {
		this.minVolume = minVolume;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getVolumeTotal() {
		return volumeTotal;
	}

	public void setVolumeTotal(int volumeTotal) {
		this.volumeTotal = volumeTotal;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	public Timestamp getRetrieved() {
		return retrieved;
	}

	public void setRetrieved(Timestamp retrieved) {
		this.retrieved = retrieved;
	}

	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

}
