package com.webbanhang.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.webbanhang.utils.ConvenientUtils;

@Service
public class ConvenientService implements ConvenientUtils{

	@Autowired
	HttpServletRequest request;
	
	public String emailToStar(String star) {
		String sao = String.valueOf(star.charAt(0));
		int u = star.indexOf("@") - 1;
		for (int i = 0; i < star.length(); i++) {
			if (i >= u) {
				sao += String.valueOf(star.charAt(i));
			} else
				sao += "*";
		}
		
		return sao;
	}
	
	public String ranDomCapCha() {
		String capChas = "";
		for (int i = 0; i < 6; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * 9 + 1;
			capChas += (int) randomDouble;
		}
		return capChas;
	}
	
	public File saveFile(MultipartFile file, String path) {
		if(!file.isEmpty()) {
			File dir = new File(request.getServletContext().getRealPath("file/"+path));
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			try {
				File saveFile = new File(dir,file.getOriginalFilename());
				file.transferTo(saveFile);
				return saveFile;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
