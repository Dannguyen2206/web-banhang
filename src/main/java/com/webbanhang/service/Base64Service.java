package com.webbanhang.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

import com.webbanhang.utils.Base64Utils;


@Service
public class Base64Service implements Base64Utils{

	public String encoder(String en) {
		String encodedString = Base64.getEncoder().encodeToString(en.getBytes());
		return encodedString;
	}
	
	public String decoder(String de) {
		byte[] decodedBytes = Base64.getDecoder().decode(de);
		String decodedString = new String(decodedBytes);
		return decodedString;
	}
}
