package controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class FileController {

//    @RequestMapping("upload.do")
//    @ResponseBody
//    public String upload(HttpServletRequest request) throws Exception {
//
//        DiskFileItemFactory factory = new DiskFileItemFactory();
//        ServletFileUpload fileUpload = new ServletFileUpload(factory);
//        List<FileItem> fileItemList = fileUpload.parseRequest(request);
//
//        for (FileItem item:fileItemList){
//            if(item.isFormField()){
//                System.out.println(item.getFieldName()+"--"+item.getString());
//            }else{
//                item.write(new File("F:\\test\\"+item.getName()));
//            }
//        }
//
//        return "Welcome";
//    }

    @RequestMapping("upload.do")
    @ResponseBody
    public String upload(String text, MultipartFile file) throws IOException {
        System.out.println(text);
        if(file == null){
            return "false";
        }
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("F:\\test\\"+file.getOriginalFilename()));
        return "Complete";
    }

    @RequestMapping("download.do")
    @ResponseBody
    public void download(HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-disposition","attachment;fileName="+ URLEncoder.encode("Java编程思想第4版.pdf","UTF-8"));
        BufferedInputStream reader = null;
        BufferedOutputStream outputStream;
        OutputStream out = null;
        try{
            reader = new BufferedInputStream(new FileInputStream("F:\\迅雷下载\\Java编程思想第4版.pdf"));
            out = response.getOutputStream();
            outputStream = new BufferedOutputStream(out);
            byte[] result = new byte[1024];
            int code = reader.read(result);
            while(code != -1){
                outputStream.write(result,0,code);
                outputStream.flush();
                code = reader.read(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
}
