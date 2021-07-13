/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class ParentChildXpath {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("how to write xpath");
		
		driver.close();
		driver.quit();
	}
}

/*<div class="RNNXgb" jsname="RNNXgb">
	 * <div class="SDkEP">
		 * <div class="iblpc" jsname="uFMOof">
			 * <style data-iml="1623736002576">
			 	* .CcAdNb{margin:auto}.QCzoEc{margin-top:3px;color:#9aa0a6;height:20px;width:20px}
			 * </style>
			 * <div class="CcAdNb">
			 * <span class="QCzoEc z1asCe MZy1Rb">
				 * <svg focusable="false" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
					 * <path d="M15.5 14h-.79l-.28-.27A6.471 6.471 0 0 0 16 9.5 6.5 6.5 0 1 0 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z">
					 * </path>
				 * </svg>
			 * </span>
			 * </div>
		 * </div>
		 * <div jscontroller="JGHKP" class="a4bIc" jsname="gLFyf" jsaction="h5M12e;input:d3sQLd;blur:jI3wzf">
			 * <style data-iml="1623736002576">
			 	* .gLFyf{background-color:transparent;border:none;margin:0;padding:0;color:rgba(0,0,0,.87);word-wrap:break-word;outline:none;display:flex;flex:100%;-webkit-tap-highlight-color:transparent;margin-top:-37px;height:34px;font-size:16px}.minidiv .gLFyf{margin-top:-35px;}.a4bIc{display:flex;flex:1;flex-wrap:wrap}.pR49Ae{color:transparent;flex:100%;white-space:pre;height:34px}.pR49Ae span{background:url("/images/experiments/wavy-underline.png") repeat-x scroll 0 100% transparent;padding:0 0 10px 0;}
			 * </style>
			 * <div class="pR49Ae gsfi" jsname="vdLsw">
			 * </div>
			 * google search input box
			 * <input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwiA7c7995jxAhWPV30KHThCD7kQ39UDCAQ">
		 * </div>
		 * <div class="dRYYxd">
			 * <style data-iml="1623736002576">
			 	* .dRYYxd{display:flex;flex:0 0 auto;margin-top:-5px;align-items:stretch;flex-direction:row}.minidiv .dRYYxd{margin-top:0}
			 * </style> 
			 * <style data-iml="1623736002576">
			 	* .BKRPef{flex:1 0 auto;display:none;cursor:pointer;align-items:center;border:0;background:transparent;outline:none;padding:0 8px;line-height:44px}.M2vV3{display:flex}.ExCKkf{height:100%;color:#70757a;vertical-align:middle;outline:none}.minidiv .BKRPef{line-height:32px}.minidiv .ExCKkf{width:20px}
			 * </style> 
			 * <style data-iml="1623736002576">
			 	* .BKRPef{padding-right:4px}.ExCKkf{margin-right:12px}.ACRAdd{border-left:1px solid #dfe1e5;height:65%}
			 * </style>
			 *  <div jscontroller="PymCCe" class="BKRPef" jsname="RP0xob" aria-label="Clear" role="button" jsaction="AVsnlb;rcuQ6b:npT2md" data-ved="0ahUKEwiA7c7995jxAhWPV30KHThCD7kQ05YFCAU">
				 *   <span class="ExCKkf z1asCe rzyADb" jsname="itVqKe" role="button" tabindex="0" aria-label="Clear">
					 *   <svg focusable="false" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
						 *   <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z">
						 *   </path>
					 *   </svg>
				 *   </span>
				 *   <span class="ACRAdd">
				 *   </span> 
			 *   </div> 
			 *   <style data-iml="1623736002576">
			 	*   .XDyW0e{flex:1 0 auto;display:flex;cursor:pointer;align-items:center;border:0;background:transparent;outline:none;padding:0 8px;width:24px;line-height:44px}.goxjub{height:24px;width:24px;vertical-align:middle}.minidiv .XDyW0e{line-height:32px}.minidiv .goxjub{width:20px;height:20px}
			 *   </style>
			 *   <div jscontroller="unV4T" class="XDyW0e" aria-label="Search by voice" role="button" tabindex="0" jsaction="h5M12e;rcuQ6b:npT2md" data-ved="0ahUKEwiA7c7995jxAhWPV30KHThCD7kQvs8DCAY">
				 *   <svg class="goxjub" focusable="false" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
					 *   <path fill="#4285f4" d="m12 15c1.66 0 3-1.31 3-2.97v-7.02c0-1.66-1.34-3.01-3-3.01s-3 1.34-3 3.01v7.02c0 1.66 1.34 2.97 3 2.97z">
					 *   </path>
					 *   <path fill="#34a853" d="m11 18.08h2v3.92h-2z">
					 *   </path>
					 *   <path fill="#fbbc05" d="m7.05 16.87c-1.27-1.33-2.05-2.83-2.05-4.87h2c0 1.45 0.56 2.42 1.47 3.38v0.32l-1.15 1.18z">
					 *   </path>
					 *   <path fill="#ea4335" d="m12 16.93a4.97 5.25 0 0 1 -3.54 -1.55l-1.41 1.49c1.26 1.34 3.02 2.13 4.95 2.13 3.87 0 6.99-2.92 6.99-7h-1.99c0 2.92-2.24 4.93-5 4.93z">
					 *   </path>
				 *   </svg>
			 * </div>
		 * </div>
	 * </div>
 * </div>
 */