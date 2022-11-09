package jp.co.trainocamp.demo.mybatis.entity;

import lombok.Data;

/**
 * コメントを格納するデータ
 */
@Data
public class Comment {
	private Integer id;
	
	private String name;
	
	private String content;
	
	private Integer articleId;
}
