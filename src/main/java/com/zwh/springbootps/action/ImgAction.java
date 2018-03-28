package com.zwh.springbootps.action;

import com.zwh.springbootps.pojo.TbImg;
import com.zwh.springbootps.pojo.TbImgExample;
import com.zwh.springbootps.service.ImgService;
import com.zwh.springbootps.util.UpImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ImgAction {

    @Autowired
    private ImgService imgService;

    @ResponseBody
    @RequestMapping("/upimgadd")
    public String articleAdd( @RequestParam(value = "file") MultipartFile file, TbImg tbImg) {

        if (file.isEmpty()) {
            return "图片不能为空";
        }
        UpImg upImg = new UpImg();
        String fileName = upImg.getImgName(file,"E:/zwh/image/");
        if (fileName.equals("false")){
            return "图片上传失败";
        }
        String imgpic = "image/"+fileName;
        tbImg.setImgpic(imgpic);
        int i = imgService.insert(tbImg);
        if (i>0){
            return "发布成功";
        }
        return "发布失败";
    }

    @ResponseBody
    @RequestMapping("getimglist")
    public List<TbImg> getImgList(String cate){
        return imgService.getImgList(cate);
    }
}
