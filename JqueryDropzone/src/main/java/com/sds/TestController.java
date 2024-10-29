package com.sds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestController {

	@ResponseBody
//	@RequestMapping("/file/upload")
	@PostMapping(path = { "/file/upload" }, consumes = { "multipart/form-data" })
	public String test(@RequestParam String param, @RequestParam MultipartFile file) {
		return "test";
	}
}
