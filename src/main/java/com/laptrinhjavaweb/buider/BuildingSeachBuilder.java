package com.laptrinhjavaweb.buider;

public class BuildingSeachBuilder {
	private String name;
	private String district;

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	private BuildingSeachBuilder(Builder builder) {
		this.name=builder.name;
		this.district=builder.district;
	}

	public static class Builder {
		private String name;
		private String district;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public BuildingSeachBuilder build() {
			return new BuildingSeachBuilder(this);
		}
	}
}
