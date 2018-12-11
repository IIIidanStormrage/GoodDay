package zxb.advance.data.mappers;

import org.springframework.stereotype.Repository;
import zxb.advance.model.dao.TopicUser;

import java.util.List;

@Repository
public interface TopicUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicUser record);

    TopicUser selectByPrimaryKey(Integer id);

    List<TopicUser> selectAll();

    int updateByPrimaryKey(TopicUser record);
}