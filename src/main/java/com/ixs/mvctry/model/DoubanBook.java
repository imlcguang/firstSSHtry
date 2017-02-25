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
@Table(name = "DoubanBook")
public class DoubanBook {
	private String isbn13;
	private String tags;// 书本标签
	private String title;
	private String pages;
	private String author;
	private String rating;//评分
	private String binding;// 装帧：平装(无盘)..
	private String publisher;
	private String pubdate;
	private String summary;
	private String imagePath;
	

	public DoubanBook() {
	}

	@Override
	public String toString() {
		return "DoubanBook [isbn13=" + isbn13 + ", tags=" + tags + ", title=" + title + ", pages=" + pages + ", author="
				+ author + ", rating=" + rating + ", binding=" + binding + ", publisher=" + publisher + ", pubdate="
				+ pubdate + ", summary=" + summary + ", imagePath=" + imagePath + "]";
	}

	public DoubanBook(String isbn13, String tags, String title, String pages, String author, String rating,
			String binding, String publisher, String pubdate, String summary, String imagePath) {
		super();
		this.isbn13 = isbn13;
		this.tags = tags;
		this.title = title;
		this.pages = pages;
		this.author = author;
		this.rating = rating;
		this.binding = binding;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.summary = summary;
		this.imagePath = imagePath;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ISBN13", nullable = false)
	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	@Column(name = "TAGS", nullable = false)
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

	@Column(name = "PAGES", nullable = false)
	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Column(name = "AUTHOR", nullable = false)
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "RATING", nullable = false)
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "BINDING", nullable = false)
	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Column(name = "PUBLISHER", nullable = false)
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Column(name = "PUBDATE", nullable = false)
	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "text")
	@Column(name = "SUMMARY", nullable = false)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "IMAGEPATH", nullable = false)
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
