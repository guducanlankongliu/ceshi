package cn.smbms.service.bill.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;
import cn.smbms.service.bill.BillService;

@Service("billService")
public class BillServiceImpl implements BillService {

	@Resource
	BillMapper billMapper;
	
	public BillMapper getBillMapper() {
		return billMapper;
	}

	public void setBillMapper(BillMapper billMapper) {
		this.billMapper = billMapper;
	}

	@Override
	public List<Bill> getBillByNameAndPage(String billName, String providerId,
			String isPayment, String from, String end) {
		// TODO Auto-generated method stub
		return billMapper.getBillByNameAndPage(billName, providerId, isPayment, from, end);
	}

}
