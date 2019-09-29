package controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import model.Client;
import service.Client_Service;
import utils.ReturnInfo;
import utils.xls;
    
@Controller
@Scope(scopeName = "session")
public class Xls_Controller {
@Autowired
Client_Service clientService;

  
List<Client> list = new ArrayList<Client>();
//
@RequestMapping("Xls/list")
@ResponseBody
public ReturnInfo list() {
	return new ReturnInfo(list);
}
@RequestMapping("Xls/save")
@ResponseBody
public String save(String ids) {
	for(int i=0;i<list.size();i++) {
		String id=","+list.get(i).getId()+",";
		if(ids.indexOf(id)<0)  continue;
		clientService.insert(list.get(i));
		list.get(i).setUploadstatus(1); 
	}
	return "{\"status\":1}";
}
@SuppressWarnings("resource")
@RequestMapping("Xls/upload")
@ResponseBody
public String upload(@RequestParam("file") MultipartFile file) {
	list = new Vector<Client>();
	try {
		InputStream input = file.getInputStream();
		Workbook wb = new HSSFWorkbook(input);
		Sheet sheet = wb.getSheetAt(0);
		int rowNum = sheet.getLastRowNum() + 1;
		for (int i = 1; i < rowNum; i++) {//ѭ��ÿ��
			Client t = new Client();
			Row row = sheet.getRow(i);
			Cell names = row.getCell(0);
			String name = names.getStringCellValue();
			t.setName(name);
			Cell sexs = row.getCell(1);
			int sex = (int) sexs.getNumericCellValue();
			t.setSex(sex);
			Cell tels = row.getCell(2);
			String tel=(String) xls.getCellValue(tels);
			t.setTel(tel);
			Cell qqs = row.getCell(3);
			String qq =(String) xls.getCellValue(qqs);
			t.setQq(qq);
			Cell emails = row.getCell(4);
			String email =emails.getStringCellValue();
			t.setEmail(email);
			Cell addresss = row.getCell(5);
			String address =addresss.getStringCellValue();
			t.setAddress(address);
			Cell infoss = row.getCell(6);
			String infos =infoss.getStringCellValue();
			t.setInfos(infos);
			
			Cell linkstatus = row.getCell(7);
			int linkstatu =(int) linkstatus.getNumericCellValue();
			t.setLinkstatu(linkstatu);
			Cell clienttatus = row.getCell(8);
			int clientstatu =(int) clienttatus.getNumericCellValue();
			t.setClientstatu(clientstatu);
			Cell purposestatus = row.getCell(9);
			int purposestatu =(int) purposestatus.getNumericCellValue();
			t.setPurposestatu(purposestatu);
			Cell assessstatus = row.getCell(10);
			int assessstatu =(int) assessstatus.getNumericCellValue();
			t.setAssessstatu(assessstatu);
			Cell execstatus = row.getCell(11);
			int execstatu =(int) execstatus.getNumericCellValue();
			t.setExecstatu(execstatu);
			Cell status = row.getCell(12);
			int statu =(int) status.getNumericCellValue();
			t.setStatu(statu);
			Cell clienttype_ids = row.getCell(13);
			int clienttype_id =(int) clienttype_ids.getNumericCellValue();
			t.setClienttype_id(clienttype_id);
			
			t.setOperatorids("");
			
			Cell createoperator_ids = row.getCell(15);
			int createoperator_id =(int) createoperator_ids.getNumericCellValue();
			t.setCreateoperator_id(createoperator_id);
//			Cell createdates = row.getCell(15);
//			String createdate =""+createdates.getDateCellValue();
//			String create=""+createdate;
//			t.setCreatedate(create);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = sdf.format(date);
			t.setCreatedate(dateStr);
			Cell src_ids = row.getCell(17);
			int src_id =(int) src_ids.getNumericCellValue();
			t.setSrc_id(src_id);
			Cell counts = row.getCell(18);
			int count =(int) counts.getNumericCellValue();
			t.setCount(count);
			Cell commentss = row.getCell(19);
			String comments =commentss.getStringCellValue();
			t.setComments(comments);
		
			
			t.setOperatornames("");
			 
			t.setId(i-1);
			list.add(t);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

	return "{\"status\":1}";
}
}
 