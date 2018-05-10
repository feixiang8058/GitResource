package com.fei.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import sun.org.mozilla.javascript.internal.ContextAction;

import com.fei.entity.Nationality;
import com.fei.entity.Page;
import com.fei.entity.Ship;
import com.fei.entity.Stype;
import com.fei.services.NationServiceImpl;
import com.fei.services.ShipServiceImpl;
import com.fei.services.StypeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShipAction extends ActionSupport{
	
	private Ship ship;
	
	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	//加载类别，国籍信息
	public String readAllInfo(){
		//System.out.println("进入读取国籍，类别表");
		//获得session,request对象      
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		NationServiceImpl nsi = new NationServiceImpl();
		StypeServiceImpl ssi = new StypeServiceImpl();
		
		List<Nationality> nlist = nsi.findAllNation();
		List<Stype> tlist = ssi.findAllStype();
		
		session.setAttribute("nlist", nlist);
		session.setAttribute("tlist", tlist);
		System.out.println("allinfo");
		return "read";
	}
	
	//分页获取船只列表
	public String readShipList(){

		//获得session,request对象      
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
				
		ShipServiceImpl si = new ShipServiceImpl();
		Page page = null;
		
		//是否已存在page
		if(session.getAttribute("page")!=null){
			page = (Page)session.getAttribute("page");
		}else{
			page = new Page();
		}
		
		//获取总页数
		int count = si.findCount();
		page.setPageCount(count);
		
		//设置页数
		if(request.getParameter("index")!=null){
			int index = Integer.parseInt(request.getParameter("index"));
			if(index<=0){
				index = 1;
			}else if(index>page.getPageRow()){
				index = page.getPageRow();
			}
			page.setPageNum(index);
		}
				
		List<Ship> slist = si.findAllShip(page.getPageNum(), page.getPageSize());
		
		//把新值加入会话中
		session.setAttribute("page", page);
		session.setAttribute("slist", slist);
		return SUCCESS;
	}

	public String add() throws IOException{
		
		//获得session,request对象      
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
				
		ShipServiceImpl si = new ShipServiceImpl();
		
		int count = si.saveShip(ship);
		boolean result = false;

		if(count>0){
			result=true;
		}
		
		ServletActionContext.getResponse().getWriter().print(result);
		return null;
	}
	
	public String selByCode() throws IOException{
		
		//获得session,request对象      
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
				
		ShipServiceImpl si = new ShipServiceImpl();

		int count = si.isExists(ship.getCode());
		
		boolean result = false;

		if(count>0){
			result=true;
		}
		
		ServletActionContext.getResponse().getWriter().print(result);
		return null;
		
	}

}
