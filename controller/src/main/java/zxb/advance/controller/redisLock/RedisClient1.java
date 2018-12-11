package zxb.advance.controller.redisLock;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zxb.advance.data.mappers.TopicUserMapper;
import zxb.advance.model.dao.TopicUser;
import zxb.advance.nosql.Redis.JedisTools;

import java.util.Date;

@Controller
@RequestMapping("/clientone")
public class RedisClient1 {

    @Autowired
    private TopicUserMapper mapper;
    @Autowired
    private JedisTools jedisTools;

    @RequestMapping("/savemoney")
    @ResponseBody
    public String saveMoney() throws Exception{
        /*JSONObject jbj = JSONObject.parseObject();*/
        TopicUser user = mapper.selectByPrimaryKey(364429);
        user.setExtend1("client one is do");
        boolean isclock = jedisTools.tryGetDistributedLock("364429","clientone",30000);
        if(isclock){
            mapper.updateByPrimaryKey(user);
            Thread.sleep(15 * 1000);
            jedisTools.releaseDistributedLock("364429","clientone");
            return "client one is work!";
        }
        return "this user can't do anything";
    }

}
