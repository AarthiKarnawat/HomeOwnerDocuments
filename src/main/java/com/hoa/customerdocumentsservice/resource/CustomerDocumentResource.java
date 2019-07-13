package com.hoa.customerdocumentsservice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class CustomerDocumentResource {
	
	@RequestMapping("/info")
	public List<String> getDocuments(String custId)
	{
		List<String> docList = new ArrayList<>();
		docList.add("Lease Agreement");
		docList.add("Maintenance Request");
		docList.add("Bills");
		return docList;
	}

}
