package cn.smbms.service.bill;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;

/**
 * 订单类:业务操作
 * @author admin
 *
 */
public interface BillService {

	/**
	 * 查询订单方法
	 * @param billName
	 * @param providerId
	 * @param isPayment
	 * @param from
	 * @param form
	 * @return
	 */
	List<Bill> getBillByNameAndPage(
			String billName,
			String providerId,
			String isPayment,
			String from,
			String form);
}
