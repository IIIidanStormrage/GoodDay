package zxb.advance.nosql.Redis;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Collections;

@Component
public class JedisTools {
    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";

    private static final Long RELEASE_SUCCESS = 1L;

    private Jedis jedis;

    public JedisTools(){
        jedis = new Jedis("127.0.0.1",6379);
    }

    /*
    加锁  lockKey为锁 requestId为用户标识  确保为该用户上的锁 "NX"如果存在key不操作
    px设置过期时间为expireTime
     */
    public boolean tryGetDistributedLock(String lockKey, String requestId, int expireTime) {

        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);

        if (LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;

    }


    public boolean releaseDistributedLock(String lockKey, String requestId) {

        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));

        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;

    }

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
