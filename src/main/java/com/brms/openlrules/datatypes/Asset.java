package com.brms.openlrules.datatypes;

public class Asset {
	public String assetKategori;
	public String assetRegistrationInformation;
	public String bpkbAtasNama;
	public String merkKendaraan;
	public Integer umurKendaraan;
	public Asset(String assetKategori, String assetRegistrationInformation, String bpkbAtasNama, String merkKendaraan,
			Integer umurKendaraan) {
		super();
		this.assetKategori = assetKategori;
		this.assetRegistrationInformation = assetRegistrationInformation;
		this.bpkbAtasNama = bpkbAtasNama;
		this.merkKendaraan = merkKendaraan;
		this.umurKendaraan = umurKendaraan;
	}
	
	
}
