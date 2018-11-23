package com.zhangchao.springboot.controller;

import com.zhangchao.springboot.entity.User;
import com.zhangchao.springboot.result.JsonResult;
import com.zhangchao.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 〈thymeleaf使用〉
 *
 * @author 22902
 * @create 2018/11/14
 */
@Controller //返回页面时，类注解不能用@RestController，否则返回的是json
@RequestMapping("/user2")
public class UserController2 {

    private static Logger logger = LoggerFactory.getLogger(UserController2.class);

   @Autowired
    private UserService userService;

    /**
     * @param model
     * @return
     */
//    @RequestMapping("/index")  //RequestMapping或者GetMapping 都可以
    @GetMapping("/index")
    public String returnHtml(Model model, HttpServletRequest request) throws Exception{
        logger.warn("-----------------------返回index.html");
        model.addAttribute("key","setKey");
        //${}可以分别从request,session,applicatin中获取变量值
        request.setAttribute("requestVal","request域中的值");
        HttpSession session = request.getSession();
        session.setAttribute("sessionVal","session域中的值");
        ServletContext context = session.getServletContext();
        context.setAttribute("applicationVal","application域中的值");
        return "index";
    }

    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public String userList(Model model) throws Exception {
        logger.warn("-----------------------返回userList.html");
        List<User> user = userService.getUser();
        model.addAttribute("userList",user);
        return "userList";
    }

    @RequestMapping(value = "/findUserById",method = RequestMethod.GET)
    public String getUserById(Integer id,Model model) throws Exception {
        logger.warn("-----------------------返回user.html");
        if (id!=null){
            User user = userService.getUserById(id);
            model.addAttribute("user",user);
            return "user";
        }else {
            return "error";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/findUserById2",method = RequestMethod.GET)
    public JsonResult getUserById2(Integer id,Model model) throws Exception {
        JsonResult result = new JsonResult();
        logger.warn("-----------------------测试findUserById2");
        if (id!=null){
            User user = userService.getUserById(id);
            model.addAttribute("user",user);
            return  result.success("成功",true,user);
        }else {
            return result.failure("参数不能为空22",false);
        }
    }

    @RequestMapping("/index2")
    public String returnJsp() throws Exception{
        logger.warn("-----------------------返回index2.jsp");
        return "index2";
    }

}
