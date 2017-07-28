package org.forten.sample.model;

import java.util.Date;

import org.forten.utils.common.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private double price;
	private int page;
	private double discount;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pubDate;

	public Book() {
		super();
	}

	public Book(int id, String name, String author, String publisher, double price, int page, double discount, Date pubDate) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.page = page;
		this.discount = discount;
		this.pubDate = pubDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getFinalPrice(){
		double p = this.price * this.discount;
		String nf = String.format("%.2f", p);
		return nf;
	}

	public String getPubDateStr(){
		if(pubDate==null){
			return "";
		}else{
			return DateUtil.convertDateToString(pubDate,"yyyy年MM月dd日");
		}
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				", publisher='" + publisher + '\'' +
				", price=" + price +
				", page=" + page +
				", discount=" + discount +
				", pubDate=" + pubDate +
				'}';
	}
}
