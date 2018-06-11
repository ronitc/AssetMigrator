package com.symantec.eloqua.assetMigrator.emailGroup;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;

/**
 * Servlet implementation class FetchEmailGroup
 */
@WebServlet("/FetchEmailGroup")
public class FetchEmailGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchEmailGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.
		 * getContextPath());
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		HttpSession session = request.getSession(false);
		BulkAndRestClient DrestClient = (BulkAndRestClient) session.getAttribute("DrestClient");

		EmailGroupList emailGroupList = new EmailGroupList();

		GetEmailGroup obj1 = new GetEmailGroup(DrestClient);

		Response response5 = obj1.getResponse("/assets/email/groups?count=100&depth=minimal");
		System.out.println("Emailgrp Fetch Status " + response5.statusCode);
		emailGroupList = DrestClient.GetEmailGroup().GetEmailGroupListInfo(response5);
		request.setAttribute("emailGroupList", emailGroupList);

		System.out.println("^EmailGroup NAME : " + response5.body);

		/////////// email group name list

		List<Elements> emailGrpList = emailGroupList.getElements();
		System.out.println("Line 76");
		Iterator<Elements> emailGrpListIterator = emailGrpList.iterator();
		// Elements element = (Elements) emailGroupList.getElements();
		// Elements element = emailGrpListIterator.next();
		JsonObject maindropdownJson = new JsonObject();
		JsonArray dropDownArray = new JsonArray();
		while (emailGrpListIterator.hasNext()) {
			JsonObject dropdownJson = new JsonObject();
			Elements element = emailGrpListIterator.next();
			String name = element.getName();
			String id = element.getId();

			dropdownJson.addProperty("ID", element.getId());
			dropdownJson.addProperty("Name", element.getName());
			dropDownArray.add(dropdownJson);
			// System.out.println("Name " + name);
		}

		maindropdownJson.add("dropdown", dropDownArray);

		// System.out.println("JsOn dropdown" + maindropdownJson);

		response.setContentType("application/json");
		response.getWriter().print(new Gson().toJson(maindropdownJson));
	}

}
