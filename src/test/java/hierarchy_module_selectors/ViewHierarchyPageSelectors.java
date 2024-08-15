package hierarchy_module_selectors;

import org.openqa.selenium.By;

public class ViewHierarchyPageSelectors {

	public static final By getHierarchy = By
			.xpath("//div[@class='detailTypesList']//p[contains(text(),'Automation hierarchy')]");

	public static final By getVersion = By
			.xpath("//div[@class='detailTypesList']//p[contains(text(),' View Page Test Version')]");

	public static final By maxBtn = By.xpath("//div[@class='view_right_side_buttons']//p[@id='max']");

	public static final By minBtn = By.xpath("//div[@class='view_right_side_buttons']//p[@id='min']");

	public static final By zoomInBtn = By.xpath("//div[@class='view_left_side_buttons']//p[@id='zoom_in']");

	public static final By zoomOutBtn = By.xpath("//div[@class='view_left_side_buttons']//p[@id='zoom_out']");

	public static final By searchNodeBox = By.xpath("//input[@placeholder='Search a node']");

	public static final By searchEmployeeBox = By.xpath("//input[@placeholder='Search an employee']");

	public static final By clearBtn = By
			.xpath("(//p-autocomplete[@id='view_search_node']/following::div[@class='closeVersion'])[1]");

	public static final By clearBtnEmployee = By.xpath("(//div[@class='closeVersion'])[2]");

	public static final By dropDown = By
			.xpath("//select[@class='searchView ng-untouched ng-pristine ng-valid ng-star-inserted']");

	public static final By overLay = By.xpath("//div[@class='backdrop full-screen']");

	public static final By downloadBtn = By.xpath("//p[@class='downloadButton']");

	public static final By moveToEditBtn = By.xpath("//p[contains(text(),'Move To Edit')]");

	public static final By nodeLevel4Btn = By
			.xpath("//*[name()='svg']//*[local-name()='g' ]//*[contains(text(),'L4')]");

	public static final By level4Node = By
			.xpath("(//*[name()='svg']//*[local-name()='g']//*[local-name()='circle'])[60]");

	public static final By leafNode = By
			.xpath("(//*[name()='svg']//*[local-name()='g']//*[local-name()='circle'])[62]");

	public static final By viewCoverageTab = By.xpath("//p[@class='viewPage'][contains(text(),'View Coverage')]");

	public static final By addOrEditCoverageBtn = By.xpath("//button[@class='add_coverage_button_edit']");

	/**
	 * Assertion Selectors
	 */

	public static final By checkValidNode = By.xpath("//p[contains(text(),'Hyderabad node found ')]");

	public static final By checkSearchNode = By.xpath(
			"//*[name()='svg']//*[local-name()='circle' and @style='fill: rgb(255, 65, 54); stroke: rgb(255, 65, 54);']");

	public static final By checkSearchNodeInvalid = By.xpath("//p[contains(text(),'Latest Tst node not found ')]");

	public static final By checkValidEmployee = By.xpath("//p[contains(text(),'Kevin Scott employee found ')]");

	public static final By checkInvalidEmployee = By.xpath("//p[contains(text(),'xyz employee not found ')]");

	public static final By checkConfirmHierarchyFromView = By
			.xpath("//div[@class='viewHierarchyStatus collapsed ng-star-inserted']//p[contains(text(),'CONFIRMED')]");

	public static final By checkMax = By.xpath("//div[@class='maximize_window ng-star-inserted']");

	public static final By checkMin = By.xpath("//p[@class='viewPage'][contains(text(),'Node Details')]");

	public static final By checkZoomIn = By
			.xpath("//div[@class='view_left_side_buttons']//p[contains(text(),'100 %')]");

	public static final By checkZoomOut = By.xpath("//div[@class='view_left_side_buttons']//p[contains(text(),'0 %')]");

	public static final By checkViewPage = By
			.xpath("//div[@class='typesHeader']//p[contains(text(),'View Hierarchy')]");

	public static final By checkNodeSelection = By.xpath(
			"//*[name()='svg']//*[local-name()='g']//*[local-name()='circle' and @style='fill: rgb(70, 130, 180); stroke: rgb(70, 130, 180);']");
}
