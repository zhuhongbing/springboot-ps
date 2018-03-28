package com.zwh.springbootps.action;

import com.zwh.springbootps.pojo.TbLw;
import com.zwh.springbootps.pojo.TbLwExample;
import com.zwh.springbootps.service.LeaveWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LeaveWordAction {
    @Autowired
    private LeaveWordService leaveWordService;

    @ResponseBody
    @RequestMapping("setlw")
    public String setLW(HttpSession session,TbLw tbLw){
        Integer uid = (Integer) session.getAttribute("userId");
        if (uid==null){
            return "login";
        }
        tbLw.setUid(uid);
        Integer i = leaveWordService.setLW(tbLw);
        return "";
    }

    @ResponseBody
    @RequestMapping("getlwinfo")
    public List<TbLw> getLwInfo(Integer offset){
        TbLwExample tbLwExample = new TbLwExample();
        tbLwExample.setLimit(3);
        tbLwExample.setOffset(offset);
        return leaveWordService.getLwList(tbLwExample);
    }
}
