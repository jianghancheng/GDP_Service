/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.gdp_service;

/**
 *
 * @author Administrator
 */
import javax.xml.ws.Endpoint;
import com.mycompany.gdp_service.GDPImpl;
public class GDPPublisher {

public static void main(String[] args) {
	 Integer port = Integer.valueOf(System.getenv("PORT"));

		   Endpoint.publish("http://0.0.0.0:"+port+"/gdp", new GDPImpl());
	    }

	}
