package com.carwash.washservice.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carwash.washservice.models.Receipt;
import com.carwash.washservice.repo.ReceiptRepo;


@Service
public class ReceiptService {
	
	@Autowired
	private ReceiptRepo repo;
	
	
	public List<Receipt> getreceipts()
	{
		return repo.findAll();
	}
	
	public Receipt getReceipt(String email)
	{
		List<Receipt> receipt = repo.findAll();
		for(Receipt rt: receipt)
		{
			if(rt.getEmailid().contentEquals(email))
			{
				return rt;
			}
		}
		return null;
	}
	
	

	public Boolean deleteReceipt(String email)
	{
		List<Receipt> all = repo.findAll();
		for( Receipt l: all)
		{
			if(l.getEmailid().contentEquals(email))
			{
				repo.deleteById(email);
				return true;
			}
		}
		return false;
	}

}
