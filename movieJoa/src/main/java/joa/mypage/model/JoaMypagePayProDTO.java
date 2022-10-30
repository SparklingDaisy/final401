package joa.mypage.model;

import java.util.Date;

public class JoaMypagePayProDTO {
	

	private String  payPro_mem_id;	
	private String  payPro_mem_name;
	private String  payPro_mem_email;
	private String 	payPro_mem_tel;
	private String  payPro_pg;	
	private String  payPro_method;
	private String  payPro_pro_name;
	private int 	payPro_price_sum;
	private int 	payPro_discount;
	private int 	payPro_total_price;
	private String  payPro_merchant_uid;
	private Date payPro_date; 
	public JoaMypagePayProDTO(String payPro_mem_id, String payPro_mem_name, String payPro_mem_email,
			String payPro_mem_tel, String payPro_pg, String payPro_method, String payPro_pro_name, int payPro_price_sum,
			int payPro_discount, int payPro_total_price, String payPro_merchant_uid, Date payPro_date, int prs_idx,
			String prs_order_idx, String prs_pro_filename, String prs_pro_name, String prs_pro_price,
			String prs_pro_count, Date prs_date) {
		super();
		this.payPro_mem_id = payPro_mem_id;
		this.payPro_mem_name = payPro_mem_name;
		this.payPro_mem_email = payPro_mem_email;
		this.payPro_mem_tel = payPro_mem_tel;
		this.payPro_pg = payPro_pg;
		this.payPro_method = payPro_method;
		this.payPro_pro_name = payPro_pro_name;
		this.payPro_price_sum = payPro_price_sum;
		this.payPro_discount = payPro_discount;
		this.payPro_total_price = payPro_total_price;
		this.payPro_merchant_uid = payPro_merchant_uid;
		this.payPro_date = payPro_date;
		this.prs_idx = prs_idx;
		this.prs_order_idx = prs_order_idx;
		this.prs_pro_filename = prs_pro_filename;
		this.prs_pro_name = prs_pro_name;
		this.prs_pro_price = prs_pro_price;
		this.prs_pro_count = prs_pro_count;
		this.prs_date = prs_date;
	}

	private int  prs_idx;
	private String prs_order_idx ;
	private String prs_pro_filename;
	private String prs_pro_name;
	private String prs_pro_price;
	private String prs_pro_count ;
	private Date prs_date; 
	
	public JoaMypagePayProDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getPayPro_mem_id() {
		return payPro_mem_id;
	}

	public void setPayPro_mem_id(String payPro_mem_id) {
		this.payPro_mem_id = payPro_mem_id;
	}

	public String getPayPro_mem_name() {
		return payPro_mem_name;
	}

	public void setPayPro_mem_name(String payPro_mem_name) {
		this.payPro_mem_name = payPro_mem_name;
	}

	public String getPayPro_mem_email() {
		return payPro_mem_email;
	}

	public void setPayPro_mem_email(String payPro_mem_email) {
		this.payPro_mem_email = payPro_mem_email;
	}

	public String getPayPro_mem_tel() {
		return payPro_mem_tel;
	}

	public void setPayPro_mem_tel(String payPro_mem_tel) {
		this.payPro_mem_tel = payPro_mem_tel;
	}

	public String getPayPro_pg() {
		return payPro_pg;
	}

	public void setPayPro_pg(String payPro_pg) {
		this.payPro_pg = payPro_pg;
	}

	public String getPayPro_method() {
		return payPro_method;
	}

	public void setPayPro_method(String payPro_method) {
		this.payPro_method = payPro_method;
	}

	public String getPayPro_pro_name() {
		return payPro_pro_name;
	}

	public void setPayPro_pro_name(String payPro_pro_name) {
		this.payPro_pro_name = payPro_pro_name;
	}

	public int getPayPro_price_sum() {
		return payPro_price_sum;
	}

	public void setPayPro_price_sum(int payPro_price_sum) {
		this.payPro_price_sum = payPro_price_sum;
	}

	public int getPayPro_discount() {
		return payPro_discount;
	}

	public void setPayPro_discount(int payPro_discount) {
		this.payPro_discount = payPro_discount;
	}

	public int getPayPro_total_price() {
		return payPro_total_price;
	}

	public void setPayPro_total_price(int payPro_total_price) {
		this.payPro_total_price = payPro_total_price;
	}

	public String getPayPro_merchant_uid() {
		return payPro_merchant_uid;
	}

	public void setPayPro_merchant_uid(String payPro_merchant_uid) {
		this.payPro_merchant_uid = payPro_merchant_uid;
	}

	public Date getPayPro_date() {
		return payPro_date;
	}

	public void setPayPro_date(Date payPro_date) {
		this.payPro_date = payPro_date;
	}

	public int getPrs_idx() {
		return prs_idx;
	}

	public void setPrs_idx(int prs_idx) {
		this.prs_idx = prs_idx;
	}

	public String getPrs_order_idx() {
		return prs_order_idx;
	}

	public void setPrs_order_idx(String prs_order_idx) {
		this.prs_order_idx = prs_order_idx;
	}

	public String getPrs_pro_filename() {
		return prs_pro_filename;
	}

	public void setPrs_pro_filename(String prs_pro_filename) {
		this.prs_pro_filename = prs_pro_filename;
	}

	public String getPrs_pro_name() {
		return prs_pro_name;
	}

	public void setPrs_pro_name(String prs_pro_name) {
		this.prs_pro_name = prs_pro_name;
	}

	public String getPrs_pro_price() {
		return prs_pro_price;
	}

	public void setPrs_pro_price(String prs_pro_price) {
		this.prs_pro_price = prs_pro_price;
	}

	public String getPrs_pro_count() {
		return prs_pro_count;
	}

	public void setPrs_pro_count(String prs_pro_count) {
		this.prs_pro_count = prs_pro_count;
	}

	public Date getPrs_date() {
		return prs_date;
	}

	public void setPrs_date(Date prs_date) {
		this.prs_date = prs_date;
	}

}