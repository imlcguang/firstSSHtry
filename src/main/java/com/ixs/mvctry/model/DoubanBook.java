package com.ixs.mvctry.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "DoubanBooktest500")//记得改！！！！！！
public class DoubanBook {
	private String bookid;
	private String title;
	private String author;
	private String publisher;
	private String pubdate;
	private String pages;
	private String price;
	private String binding;// 装帧：平装(无盘)..
	private String isbn13;
	private String rating;// 评分
	private String ratenum; // 评价人数
	private String summary;// 内容简介
	private String authorsummary;// 作者简介
	private String tags;// 书本标签
	private String imagePath;
	private String doings;//在读
	private String collections;//读过
	private String wishes;//想读

	public DoubanBook() {
	}


	@Override
	public String toString() {
		return "DoubanBook [bookid=" + bookid + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", pubdate=" + pubdate + ", pages=" + pages + ", price=" + price + ", binding=" + binding
				+ ", isbn13=" + isbn13 + ", rating=" + rating + ", ratenum=" + ratenum + ", summary=" + summary
				+ ", authorsummary=" + authorsummary + ", tags=" + tags + ", imagePath=" + imagePath + ", doings="
				+ doings + ", collections=" + collections + ", wishes=" + wishes + "]";
	}


	public DoubanBook(String bookid, String title, String author, String publisher, String pubdate, String pages,
			String price, String binding, String isbn13, String rating, String ratenum, String summary,
			String authorsummary, String tags, String imagePath, String doings, String collections, String wishes) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
		this.isbn13 = isbn13;
		this.rating = rating;
		this.ratenum = ratenum;
		this.summary = summary;
		this.authorsummary = authorsummary;
		this.tags = tags;
		this.imagePath = imagePath;
		this.doings = doings;
		this.collections = collections;
		this.wishes = wishes;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid", nullable = false,unique=true)
	public String getBookid() {
		return bookid;
	}
	
	
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	
	
	@Column(name = "ISBN13", nullable = false)
	public String getIsbn13() {
		return isbn13;
	}



	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	@Column(name = "TAGS")
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Column(name = "TITLE", nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "PAGES")
	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Column(name = "AUTHOR")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "RATING")
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "BINDING")
	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Column(name = "PUBLISHER")
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Column(name = "PUBDATE")
	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "text")
	@Column(name = "SUMMARY")
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "IMAGEPATH")
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "price")
	public String getPrice() {
		return price;
	}
	
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Column(name = "Ratenum")
	public String getRatenum() {
		return ratenum;
	}
	
	
	public void setRatenum(String ratenum) {
		this.ratenum = ratenum;
	}
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "text")
	@Column(name = "AUTHORSUMMARY")
	public String getAuthorsummary() {
		return authorsummary;
	}
	
	
	public void setAuthorsummary(String authorsummary) {
		this.authorsummary = authorsummary;
	}
	
	@Column(name = "DOINGS")
	public String getDoings() {
		return doings;
	}
	
	
	public void setDoings(String doings) {
		this.doings = doings;
	}
	
	@Column(name = "COLLECTIONS")
	public String getCollections() {
		return collections;
	}
	
	
	public void setCollections(String collections) {
		this.collections = collections;
	}
	
	@Column(name = "WISHES")
	public String getWishes() {
		return wishes;
	}
	
	
	public void setWishes(String wishes) {
		this.wishes = wishes;
	}
}
