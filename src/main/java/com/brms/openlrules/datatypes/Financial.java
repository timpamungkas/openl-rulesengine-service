package com.brms.openlrules.datatypes;

public class Financial {
	public Integer angsuran;
	public Integer jumlahTanggungan;
	public Integer ltv;
	public String repeatOrder;
	public Integer tenor;
	public Integer totalFunding;
	public String tujuanPinjaman;
	public Financial(Integer angsuran, Integer jumlahTanggungan, Integer ltv, String repeatOrder, Integer tenor,
			Integer totalFunding, String tujuanPinjaman) {
		super();
		this.angsuran = angsuran;
		this.jumlahTanggungan = jumlahTanggungan;
		this.ltv = ltv;
		this.repeatOrder = repeatOrder;
		this.tenor = tenor;
		this.totalFunding = totalFunding;
		this.tujuanPinjaman = tujuanPinjaman;
	}
}
