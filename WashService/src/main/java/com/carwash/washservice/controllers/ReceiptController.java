package com.carwash.washservice.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.washservice.models.Receipt;
import com.carwash.washservice.services.ReceiptService;

@RestController
public class ReceiptController {
	
	
	@Autowired
	private ReceiptService rs;
	
	@GetMapping("/getservices")
	public List<Receipt> getservices()
	{
		return rs.getreceipts();
	}

	@GetMapping("/getperticularservice/{id}")
	public Receipt getperticularservice(@PathVariable String username)
	{
		return rs.getReceipt(username);
	}
	
	
	
	@DeleteMapping("/deleteRec/{username}")
	public Boolean deleteRec(@PathVariable String username)
	{
		return rs.deleteReceipt(username);
	}

}
