package zxb.advance.service.service;

import org.springframework.stereotype.Service;
import zxb.advance.model.dao.TopicUser;

public interface RollBackService {
    void updateInfo(int id);
    void makeExecption();
}
