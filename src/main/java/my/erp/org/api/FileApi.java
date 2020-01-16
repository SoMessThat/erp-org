package my.erp.org.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import my.erp.org.util.ResponseVo;

@RequestMapping("/file")
public interface FileApi {
	
	/**
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("/uploadFile")
	ResponseVo<String> uploadFile(MultipartFile file);
}
