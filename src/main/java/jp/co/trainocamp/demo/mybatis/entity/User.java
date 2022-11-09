package jp.co.trainocamp.demo.mybatis.entity;

import lombok.Data;

/**
 * ユーザー情報を格納するデータ
 */
@Data
public class User {

	private int userId;
	
	private String name;
	
	private int age;
}
