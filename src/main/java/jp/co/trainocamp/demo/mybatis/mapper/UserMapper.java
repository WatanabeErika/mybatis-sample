package jp.co.trainocamp.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.trainocamp.demo.mybatis.entity.User;

/**データベースへアクセスする機能が自動で生成されるインターフェース。
 * @author erika
 *
 */
@Mapper
public interface UserMapper {
	/**全件ユーザーを取得
	 * @return　全ユーザーの情報
	 */
	List<User> selectAll();
}
