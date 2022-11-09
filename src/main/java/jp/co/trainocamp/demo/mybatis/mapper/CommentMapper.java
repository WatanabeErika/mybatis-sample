package jp.co.trainocamp.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.trainocamp.demo.mybatis.entity.Comment;

@Mapper
public interface CommentMapper {
	/**コメント全件表示
	 * @return
	 */
	List<Comment> findByArticleId(Integer articleId);
	
	/**コメント投稿
	 * @param comment
	 */
	void insert(Comment comment);
	
	/**コメント削除
	 * @param articleId
	 */
	void deleteByArticleId(Integer articleId);
}
