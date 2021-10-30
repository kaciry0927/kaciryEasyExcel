package com.kaciry.own.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.kaciry.own.excelListener.DefaultListener;
import com.kaciry.own.model.User;
import com.kaciry.own.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author Kaciry Smith
 * @create 2021-10-30 1:16 下午
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private UserService userService;

    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.openmosix-officiated.spreadsheet.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和EasyExcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-Disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        List<User> users = userService.getBaseMapper().selectList(null);
        EasyExcel.write(response.getOutputStream(), User.class).sheet("模板").registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).doWrite(users);
    }

    @GetMapping("/add")
    public boolean addData() {
        User user = new User();
        user.setUserName("kaciry");
        user.setRmbAccount("24414.41");
        return userService.save(user);
    }

    @GetMapping("/read")
    public boolean readExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(),User.class,new DefaultListener(userService)).sheet().doRead();
        return true;
    }

}
