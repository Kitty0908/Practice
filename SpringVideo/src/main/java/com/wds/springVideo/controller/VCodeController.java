package com.wds.springVideo.controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static java.awt.image.BufferedImage.TYPE_3BYTE_BGR;

@Controller
public class VCodeController {

    final static private char[] VCODE_ARRAY = {'0','1','2','3','4','5','6','7','8','9'};

    @RequestMapping("/vCode")
    public void vCode(HttpServletResponse resp, HttpSession session){

        BufferedImage bi = new BufferedImage(80,30,TYPE_3BYTE_BGR);
        Graphics2D gs = bi.createGraphics();

        gs.setFont(new Font("宋体",Font.BOLD,25));

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            char c = VCODE_ARRAY[RandomUtil.randomInt(10)];

            gs.setColor(
                    new Color(
                            RandomUtil.randomInt(255),
                            RandomUtil.randomInt(255),
                            RandomUtil.randomInt(255)
                    )
            );

            gs.drawString(String.valueOf(c),(i+1)*17-8,25);

            sb.append(c);
        }

        // 设置返回内容类型
        resp.setContentType("image/jpeg");

        // 设置不缓存
        resp.setDateHeader("Expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");

        session.setAttribute("vCode",sb.toString());

        ServletOutputStream os = null;
        try {
            os = resp.getOutputStream();
            ImageIO.write(bi,"jpeg",os);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
