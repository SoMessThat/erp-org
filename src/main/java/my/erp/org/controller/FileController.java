package my.erp.org.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import my.erp.org.api.FileApi;
import my.erp.org.util.ResponseVo;
import my.erp.org.util.UUIDUtil;

@RestController
public class FileController implements FileApi{

//	private String path = "H:/images/";
	@Value("${img.url}")
	private String path;
	
	@Override
	public ResponseVo<String> uploadFile(MultipartFile file) {
		ResponseVo<String> result = new ResponseVo<String>();
        if (file.isEmpty()) {
           result.setResult("ERROR");
           result.setMsg("上传文件为空");
           result.setStatus(400);
           return result;
        }
        //String path = request.getServletContext().getRealPath("/upload");
        //System.out.println("path = " + path);
        //获取上传的文件名称，并结合存放路径，构建新的文件名称
        String oriName = file.getOriginalFilename();
		String filename = UUIDUtil.getUUID() + oriName.substring(oriName.lastIndexOf('.'), oriName.length());
		
		File filepath = new File(path + filename);
		// 判断路径是否存在，不存在则新创建一个
		if (!filepath.getParentFile().exists()) {
			filepath.getParentFile().mkdirs();
		}
		try {
			file.transferTo(filepath);
			System.out.println(path + filename);
			result.setData("/img/"+filename);
			result.setResult("SUCCESS");
			result.setMsg("上传成功");
			result.setStatus(200);
			return result;
		} catch (Exception e) {
			result.setResult("ERROR");
			result.setMsg("上传文件失败");
			result.setStatus(400);
			return result;
		}
	}

}
