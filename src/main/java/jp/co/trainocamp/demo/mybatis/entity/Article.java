package jp.co.trainocamp.demo.mybatis.entity;

import java.util.List;

import lombok.Data;

/**
 * 記事を格納するデータ
 */
@Data
public class Article {
	private Integer id;
	
	private String name;
	
	private String content;
	
	private List<Comment> commentList;
}
