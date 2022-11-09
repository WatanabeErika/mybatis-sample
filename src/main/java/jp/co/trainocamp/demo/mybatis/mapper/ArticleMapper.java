package jp.co.trainocamp.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.trainocamp.demo.mybatis.entity.Article;

@Mapper
public interface ArticleMapper {
	/**記事全件を取得する
	 * @return
	 */
	List<Article> selectAll();
	
	/**記事投稿
	 * @param article
	 */
	void insert(Article article);
	
	/**記事削除
	 * @param id
	 */
	void deleteById(Integer id);
}
