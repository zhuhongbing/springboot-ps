package com.zwh.springbootps.service;




import com.zwh.springbootps.pojo.TbLw;
import com.zwh.springbootps.pojo.TbLwExample;

import java.util.List;

public interface LeaveWordService {
    Integer setLW(TbLw tbLw);
    List<TbLw> getLwList(TbLwExample tbLwExample);
}
