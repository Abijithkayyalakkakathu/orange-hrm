package hrmlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	
	@FindBy(id="txtUsername")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(id="btnLogin")
	public static WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"forgotPasswordLink\"]/a")
	public static WebElement forgotpassword;
	
	@FindBy(id="btnCancel")
	public static WebElement cancelbutton;

	@FindBy(xpath="//*[@id=\"branding\"]/a[1]/img")
	public static WebElement logo;
	
	//@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	//public static WebElement admin;
	
	//@FindBy(xpath="//*[@id=\"menu_admin_UserManagement\"]")
	//public static WebElement usermanage;
	
	//@FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
	//public static WebElement users;
	
	//@FindBy(name="btnAdd")
	//public static WebElement add;
	
	//@FindBy(name="btnCancel")
	//public static WebElement cancel;
	
	//@FindBy(name="systemUser[userType]")
	//public static WebElement role;
	
	//@FindBy(name="systemUser[employeeName]")
	//public static WebElement empname;
	
	//@FindBy(name="systemUser[userName]")
	//public static WebElement usrname;
	
	//@FindBy(name="systemUser[status]")
	//public static WebElement status;
	
	//@FindBy(name="systemUser[password]")
	//public static WebElement pwd;
	
	//@FindBy(name="systemUser[confirmPassword]")
	//public static WebElement confirmpwd;
	
	//@FindBy(name="addbutton")
	//public static WebElement addbtn;
	
	//@FindBy(name="searchSystemUser[userName]")
	//public static WebElement usernme;
	
	//@FindBy(name="searchSystemUser[userType]")
	//public static WebElement usertype;
	
	//@FindBy(name="searchSystemUser[employeeName]")
	//public static WebElement employname;
	
	
	//@FindBy(name="searchSystemUser[status]")
	//public static WebElement empstatus;
	
	//@FindBy(id="searchBtn")
	//public static WebElement search;
	
	//@FindBy(id="resetBtn")
	//public static WebElement reset;
	
	@FindBy(xpath="//*[@id=\"menu__Performance\"]/b")
	public static WebElement perf;
	
	@FindBy(xpath="//*[@id=\"menu_performance_Configure\"]")
	public static WebElement con;
	
	@FindBy(xpath="//*[@id=\"menu_performance_searchKpi\"]")
	public static WebElement kpis;
	
	@FindBy(id="btnAdd") 
	public static WebElement add;
	
	@FindBy(xpath="//*[@id=\"btnCancel\"]")
	public static WebElement cancel;
	
	@FindBy(name="saveBtn")
	public static WebElement save;
	
	@FindBy(xpath="//*[@id=\"defineKpi360_jobTitleCode\"]")
	public static WebElement jobtitle;
	
	@FindBy(xpath="//*[@id=\"defineKpi360_keyPerformanceIndicators\"]")
	public static WebElement kpi;
	
	@FindBy(xpath="//*[@id=\"defineKpi360_minRating\"]")
	public static WebElement minrating;
	
	@FindBy(xpath="//*[@id=\"defineKpi360_maxRating\"]")
	public static WebElement maxrating;
	
	@FindBy(xpath="//*[@id=\"defineKpi360_makeDefault\"]")
	public static WebElement mdc;
	
	
	@FindBy(xpath="//*[@id=\"kpi360SearchForm_jobTitleCode\"]")
	public static WebElement job;
	
	@FindBy(name="searchBtn")
	public static WebElement search;
	
	@FindBy(xpath="//*[@id=\"ohrmList_chkSelectRecord_1\"]")
	public static WebElement del;
	
	@FindBy(xpath="//*[@id=\"btnDelete\"]")
	public static WebElement delete;
	
	@FindBy(xpath="//*[@id=\"dialogDeleteBtn\"]")
	public static WebElement ok;
	
	@FindBy(xpath="//*[@id=\"menu_performance_addPerformanceTracker\"]")
	public static WebElement tracks;
	
	@FindBy(id="btnAdd")
	public static WebElement tadd;
	
	@FindBy(id="btnCancel")
	public static WebElement tcancel;
	
	@FindBy(name="addPerformanceTracker[tracker_name]")
	public static WebElement trackername;
	
	@FindBy(name="addPerformanceTracker[employeeName][empName]")
	public static WebElement employname;
	
	@FindBy(xpath="//*[@id=\"addPerformanceTracker_availableEmp\"]/option[2]")
	public static WebElement availreviewers;
	
	@FindBy(xpath="//*[@id=\"btnAssignEmployee\"]")
	public static WebElement aadd;
	
	@FindBy(id="btnSave")
	public static WebElement ssave;
}
