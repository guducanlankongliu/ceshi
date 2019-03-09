package entity;

import java.util.List;

public class Page {

private int pagecount=0;//显示在 浏览器 有 几页 
	
public int getPagecount() {
	return pagecount;
}

public void setPagecount(int pagecount) {
	this.pagecount = pagecount;
}

public int getPagesize() {
	return pagesize;
}

public void setPagesize(int pagesize) {
	this.pagesize = pagesize;
}

public int getPagesum() {
	return pagesum;
}

public void setPagesum(int pagesum) {
	if(pagesum>0){
	this.pagesum = pagesum;
	pagecount=this.pagesum%pagesize==0?(this.pagesum/pagesize):(this.pagesum/pagesize+1);
	// 48%5=3  进入 this.pagesum/pagesize+1     等于= 48/5+1 =8;
	//   给这个pagesum 大于 0   之后就会进入这里  if下面的 代码  得出 浏览器显示多少 页 数
	
	}
}

public int getDangqianpage() {
	return dangqianpage;
}
// 从servlet 中 我传 一个  当前我 选中的页数多少 传过来  就 进入 if 判断  
// 大于等于 0 就 进入下面 if
public void setDangqianpage(int dangqianpage) {
	if(dangqianpage>0){
		this.dangqianpage=dangqianpage;
		this.dangqianpage=(this.dangqianpage-1)*this.pagesize;
		
		
		// 得在 page 实体类 写好 起始页码的  用 页码数-1 * 显示条数=起始页数
	}
		
		
	
	
}



private int  pagesize=2;	// 每页显示24条手工数量	 
//        48 除以5  =
	
private int pagesum; //总共多少条信息
private int dangqianpage=1; //当前页数 也就是第一页
	


	
}
