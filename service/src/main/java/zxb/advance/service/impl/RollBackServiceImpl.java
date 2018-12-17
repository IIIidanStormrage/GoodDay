package zxb.advance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zxb.advance.data.mappers.TopicUserMapper;
import zxb.advance.model.dao.TopicUser;
import zxb.advance.service.service.RollBackService;

@Service
public class RollBackServiceImpl implements RollBackService {
    @Autowired
    private TopicUserMapper userMapper;
    @Override
    /**
     * 1：Propagation.REQUIRES  直接用当前事务  被调用方法报错  调用方法trycatch其它方法也会回滚
     * 2：Propagation.REQUIRES_NEW   如果有会新启事物  被调用方法报错,调用方法不会回滚  调用方法报错   被调用方法不会回滚
     * 3: Propagation.NESTED   如果有事物变成该事务的子事物    被调用方法报错,调用方法不会回滚   调用方法报错，被调用方法受影响也会回滚
     */
    @Transactional(propagation = Propagation.NESTED)
    public void updateInfo(int id){
            TopicUser topicUser = new TopicUser();
            topicUser.setId(102454);
            topicUser.setName("zxb");
            topicUser.setExtend1("zxbzxb");
            topicUser.setExtend2(6324);
            userMapper.updateByPrimaryKey(topicUser);
    }
    //value属性可以使用自己定义的数据管理器
    @Transactional(rollbackFor = Exception.class)
    public void makeExecption(){
        TopicUser insertUser =new TopicUser();
        userMapper.insert(insertUser);
    }
}
