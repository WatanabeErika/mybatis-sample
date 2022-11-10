package jp.co.trainocamp.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.trainocamp.demo.mybatis.entity.Article;

@Mapper
public interface ArticleCommentMapper {
	/**記事とコメント結合
	 * @return
	 */
	List<Article> findArticleComment();
}
