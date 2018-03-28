package com.zwh.springbootps.action;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.zwh.springbootps.pojo.TbUser;
import com.zwh.springbootps.service.LoginService;
import com.zwh.springbootps.util.UpImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@Controller
public class LoginAction {
    @Autowired
    private LoginService loginService;
    @Autowired
    DefaultKaptcha defaultKaptcha;
    @ResponseBody
    @RequestMapping("/login")
    public String Login(HttpSession httpSession, TbUser tbUser, String code){
        TbUser user = loginService.Login(tbUser);
        String captchaId = (String) httpSession.getAttribute("vrifyCode");
        if (!code.equals(captchaId)){
            return "验证码错误";
        }
        if (user!=null){
            httpSession.setAttribute("userId",user.getUserid());
            httpSession.setAttribute("userName",user.getUsername());
            return "登陆成功";
        }else{

            return "error";
        }
    }
    @ResponseBody
    @RequestMapping("/enroll")
    public String Enroll(TbUser tbUser, @RequestParam(value = "file") MultipartFile file){
        TbUser user = loginService.selectName(tbUser.getUsername());
        if (user!=null){
            return "用户名已存在";
        }else {
            if (file.isEmpty()) {
                return "文件不能为空";
            }
            UpImg upImg =new UpImg();
            String fileName = upImg.getImgName(file,"E:/zwh/image/");
            tbUser.setUserpic(fileName);
            if (file.equals("false")){
                return "上传文件失败";
            }else {
                int i = loginService.Enroll(tbUser);
                if (i>0){
                    return "注册成功";
                }
                return "注册失败";
            }
        }
    }

    @RequestMapping("/loginClose")
    public String loginClose(HttpSession httpSession){
        httpSession.removeAttribute("userId");
        httpSession.removeAttribute("userName");
        return "index";
    }

    //生成验证码图片
    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    @ResponseBody
    @RequestMapping("/updatainfo")

    public String upDataInfo(HttpSession session,String password){
        TbUser tbUser = new TbUser();
        tbUser.setPassword(password);
        tbUser.setUserid((Integer) session.getAttribute("userId"));
        int i = loginService.upDataInfo(tbUser);
        if (i>0){
            return "修改成功";
        }
        return "修改失败";
    }

}
