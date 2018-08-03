package com.brms.openlrules.datatypes;

public class Customer {
	public String id;
	public String name;
	public Integer umurDebitur;
	public String statusPernikahan;
	public String statusTempatTinggal;
	public String jenisKelamin;
	public String profesi;
	public String pendidikanTerakhir;
	public String nomorTeleponPasangan;
	public String perabotTersedia;
	public String riwayat12BulanTerakhir;
	public Integer totalPendapatanBulanan;
	public String ekonomiSektor;
	public Asset asset;
	public Financial financial;
	public Others others;
	
	public Customer(String id, String name, Integer umurDebitur, String statusPernikahan, String statusTempatTinggal,
			String jenisKelamin, String profesi, String pendidikanTerakhir, String nomorTeleponPasangan,
			String perabotTersedia, String riwayat12BulanTerakhir, Integer totalPendapatanBulanan, String ekonomiSektor,
			Asset asset, Financial financial, Others others) {
		super();
		this.id = id;
		this.name = name;
		this.umurDebitur = umurDebitur;
		this.statusPernikahan = statusPernikahan;
		this.statusTempatTinggal = statusTempatTinggal;
		this.jenisKelamin = jenisKelamin;
		this.profesi = profesi;
		this.pendidikanTerakhir = pendidikanTerakhir;
		this.nomorTeleponPasangan = nomorTeleponPasangan;
		this.perabotTersedia = perabotTersedia;
		this.riwayat12BulanTerakhir = riwayat12BulanTerakhir;
		this.totalPendapatanBulanan = totalPendapatanBulanan;
		this.ekonomiSektor = ekonomiSektor;
		this.asset = asset;
		this.financial = financial;
		this.others = others;
	}
	
	
}
