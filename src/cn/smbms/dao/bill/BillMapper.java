package cn.smbms.dao.bill;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Bill;

/**
 * 订单接口
 * @author admin
 *
 */
public interface BillMapper {

	//查询订单的方法
	List<Bill> getBillByNameAndPage(
			@Param("billName")String billName,
			@Param("providerId")String providerId,
			@Param("isPayment")String isPayment,
			@Param("from")String from,
			@Param("end")String end);
}
