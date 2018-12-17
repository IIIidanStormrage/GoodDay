package zxb.advance.controller.rollback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zxb.advance.service.service.RollBackService;

@Controller
@RequestMapping("/rollback")
public class RollBackController {
    @Autowired
    private RollBackService rollBackService;

    /**
     *  默认Required如果被调用的事物回滚外部事物也跟着回滚
     */
    @RequestMapping("/inseterror")
    @ResponseBody
    @Transactional
    public String inserterro(int id){
        rollBackService.updateInfo(id);
        try {
            //如果是new或者nest的事物,不捕获异常,异常冒泡而出
            //调用者上面的方法也会回滚
            rollBackService.makeExecption();
        }catch (Exception e){
        }
        return "zxb";
    }

    /**
     *  默认Required如果被调用的事物回滚外部事物也跟着回滚
     */
    @RequestMapping("/req_new")
    @ResponseBody
    @Transactional
    public String req_new(int id){
        rollBackService.updateInfo(id);
        try {
            rollBackService.makeExecption();
        }catch (Exception e){
        }
        return "zxb";
    }
}
