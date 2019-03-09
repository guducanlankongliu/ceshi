package cn.smbms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.smbms.pojo.Bill;
import cn.smbms.service.bill.BillService;

@Controller
@RequestMapping("/bill")
public class BillController {

	@Resource
	BillService billService;
	
	public BillService getBillService() {
		return billService;
	}

	public void setBillService(BillService billService) {
		this.billService = billService;
	}

	@RequestMapping("/list.html")
	public String getBillList(
			@RequestParam(value="queryProductName",required=false)String productName,
			@RequestParam(value="queryProviderId",required=false)String providerId,
			@RequestParam(value="queryIsPayment",required=false)String isPayment,
			/*@RequestParam(value="")*/
			Model model){
		System.out.println(productName+","+isPayment);
		List<Bill> billList = 
				billService.getBillByNameAndPage(productName, providerId, isPayment, null, null);
		for (Bill bill : billList) {
			System.out.println(bill.getBillCode());
		}
		model.addAttribute("billList", billList);
		return "billlist";
	}
	
}
