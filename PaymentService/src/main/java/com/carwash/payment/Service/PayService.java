package com.carwash.payment.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;


@Service
public class PayService {
	
	@Autowired
	private APIContext apicontext;
	
	
	public Payment createpay(
		
		Double total,
		String currency,
		String method,
		String intent,
		String cancelurl,
		String successurl)throws PayPalRESTException{
			
		Amount amount =new Amount();
		amount.setCurrency(currency);
		total=new BigDecimal(total).setScale(2,RoundingMode.HALF_UP).doubleValue();
		amount.setTotal(String.format("%.2f", total));
		
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction);
		
		Payer payer=new Payer();
		payer.setPaymentMethod(method.toString());
		
		Payment payment=new Payment();
		payment.setIntent(intent.toString());
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		RedirectUrls  redirect=new RedirectUrls();
		redirect.setCancelUrl(cancelurl);
		redirect.setReturnUrl(successurl);
		payment.setRedirectUrls(redirect);
		
		
		return payment.create(apicontext);
	}
	
	public Payment executepay(String paymentId,String payerId) throws PayPalRESTException{
		
		Payment payment=new Payment();
		payment.setId(paymentId);
		PaymentExecution paymentexecution=new PaymentExecution();
		paymentexecution.setPayerId(payerId);
		return payment.execute(apicontext, paymentexecution);
	}
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
			
			
			
		
		
	

