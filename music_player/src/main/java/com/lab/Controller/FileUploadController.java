package com.lab.Controller;


import com.lab.pojo.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileUploadController{

    @PostMapping("/upload")
    public Result<String> uploadFile(MultipartFile file) throws IOException {
        //吧文件的内容存储到本地磁盘上
        String originalFilename=file.getOriginalFilename();
        file.transferTo(new File("S:\\project\\music_player\\File\\"+originalFilename));

        return Result.success("url地址");
    }
}