/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.priceline;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author manju
 */
public class PricelineTest {
    
    public PricelineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;
    @Before
    public void setUp() {
         driver= DriverUtils.getChromeDriver();
         driver.get("http://www.google.com");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPriceline() throws InterruptedException{
        driver.get("https://www.priceline.com/");
       driver.findElement(By.id("location")).sendKeys("New York");//enters newyork
       driver.findElement(By.id("location-dropdown-item-0")).click();
       
       
       driver.findElement(By.id("date-range")).click();//enters date
       driver.findElement(By.xpath("//*[@id=\"hotel-date-range\"]/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[5]/div")).click();
       driver.findElement(By.xpath("//*[@id=\"hotel-date-range\"]/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[19]/div")).click();
      
        
      // driver.findElement(By.id("traveler-selection-button")).click();
       driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/div/div[5]/button")).click();
      String title=driver.getTitle();
        System.out.println(title);
        assertEquals("Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.", driver.getTitle());
       
  //driver.findElement(By.xpath("//button[@class='sc-jKVCRD jdGpJL']")).click();
  
  
//  driver.findElement(By.id("date-range")).submit();
//        
//        driver.findElement(By.xpath("//*[@id=\"hotel-date-range\"]/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[5]/div")).click();
//       driver.findElement(By.xpath("//*[@id=\"hotel-date-range\"]/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[19]/div")).click();
//   driver.findElement(By.xpath("//button[@class='sc-jKVCRD ghhSHN']")).click();
//   
    
    }
}
