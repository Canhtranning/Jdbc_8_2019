package com.laptrinhjavaweb.buider;

public class BuildingSeachBuilder {
	private String name;
	private String district;
//	private Integer buildingArea;
//	private Integer numberOfBasement;
	private String buildingArea;
	private String numberOfBasement;
	private String street;
	private String ward;
	private String costRent;
	private String serviceCost;
	private String carCost;
	private String motorbikeCost;
	private String overtimeCost;
	private String[]buildingTypes=new String[] {};

//	public Integer getBuildingArea() {
//		return buildingArea;
//	}
//
//	public Integer getNumberOfBasement() {
//		return numberOfBasement;
//	}
	public String getBuildingArea() {
		return buildingArea;
	}

	public String getNumberOfBasement() {
		return numberOfBasement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getCostRent() {
		return costRent;
	}

	public void setCostRent(String costRent) {
		this.costRent = costRent;
	}

	public String getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}

	public String getMotorbikeCost() {
		return motorbikeCost;
	}

	public void setMotorbikeCost(String motorbikeCost) {
		this.motorbikeCost = motorbikeCost;
	}

	public String getOvertimeCost() {
		return overtimeCost;
	}

	public void setOvertimeCost(String overtimeCost) {
		this.overtimeCost = overtimeCost;
	}

	public String getCarCost() {
		return carCost;
	}

	public void setCarCost(String carCost) {
		this.carCost = carCost;
	}

	private BuildingSeachBuilder(Builder builder) {
		this.name = builder.name;
		this.district = builder.district;
		this.buildingArea = builder.buildingArea;
		this.numberOfBasement = builder.numberOfBasement;
		this.street = builder.street;
		this.ward = builder.ward;
		this.buildingTypes=builder.buildingTypes;
	}

	public String[] getBuildingTypes() {
		return buildingTypes;
	}

	public void setBuildingTypes(String[] buildingTypes) {
		this.buildingTypes = buildingTypes;
	}

	public static class Builder {
		private String name;
		private String district;
//		private Integer buildingArea;
//		private Integer numberOfBasement;
		private String buildingArea;
		private String numberOfBasement;
		private String street;
		private String ward;
		private String costRent;
		private String serviceCost;
		private String carCost;
		private String motorbikeCost;
		private String overtimeCost;
		private String[]buildingTypes=new String[] {};

		public Builder setBuildingArea(String buildingArea) {
			this.buildingArea = buildingArea;
			return this;
		}

		public Builder setNumberOfBasement(String numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setWard(String ward) {
			this.ward = ward;
			return this;
		}

		public Builder setCostRent(String costRent) {
			this.costRent = costRent;
			return this;
		}

		public Builder setServiceCost(String serviceCost) {
			this.serviceCost = serviceCost;
			return this;
		}

		public Builder setCarCost(String carCost) {
			this.carCost = carCost;
			return this;
		}

		public Builder setMotorbikeCost(String motorbikeCost) {
			this.motorbikeCost = motorbikeCost;
			return this;
		}

		public Builder setOvertimeCost(String overtimeCost) {
			this.overtimeCost = overtimeCost;
			return this;
		}
		public Builder setBuildingTypes(String[] buildingTypes) {
			this.buildingTypes = buildingTypes;
			return this;
		}
		public BuildingSeachBuilder build() {
			return new BuildingSeachBuilder(this);
		}

		

		

	}
}
